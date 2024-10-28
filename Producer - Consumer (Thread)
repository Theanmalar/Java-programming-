import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    // Method for producer to add data
    public synchronized void produce(int value) throws InterruptedException {
        // Wait if the queue is full
        while (queue.size() == capacity) {
            wait();
        }
        // Add data to the queue
        queue.offer(value);
        System.out.println("Produced: " + value);
        // Notify the consumer that data is available
        notify();
    }

    // Method for consumer to retrieve data
    public synchronized int consume() throws InterruptedException {
        // Wait if the queue is empty
        while (queue.isEmpty()) {
            wait();
        }
        // Remove data from the queue
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        // Notify the producer that space is available
        notify();
        return value;
    }
}

class Producer extends Thread {
    private SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                sharedQueue.produce(value++);
                Thread.sleep(500); // Simulate time taken to produce
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sharedQueue.consume();
                Thread.sleep(1000); // Simulate time taken to consume
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        // Shared object between producer and consumer
        SharedQueue sharedQueue = new SharedQueue(5); // Buffer size of 5

        // Create producer and consumer threads
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);

        // Start the threads
        producer.start();
        consumer.start();
    }
}
