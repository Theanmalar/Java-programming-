import java.io.*;
import java.net.*;

public class MultiFileDownloader {

    // A method to download a file from a given URL
    public static void downloadFile(String fileURL, String destination) {
        try (BufferedInputStream in = new BufferedInputStream(new URL(fileURL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(destination)) {

            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }

            System.out.println("Downloaded: " + destination);
        } catch (IOException e) {
            System.out.println("Error downloading file: " + destination);
            e.printStackTrace();
        }
    }

    // Thread class for downloading a file
    static class DownloadThread extends Thread {
        private String fileURL;
        private String destination;

        public DownloadThread(String fileURL, String destination) {
            this.fileURL = fileURL;
            this.destination = destination;
        }

        @Override
        public void run() {
            downloadFile(fileURL, destination);
        }
    }

    public static void main(String[] args) {
        // URLs of files to be downloaded
        String[] fileURLs = {
            "https://example.com/file1.jpg",
            "https://example.com/file2.mp3",
            "https://example.com/file3.pdf"
        };

        // Names of the destination files
        String[] destinations = {
            "file1.jpg",
            "file2.mp3",
            "file3.pdf"
        };

        // Create and start a thread for each file download
        Thread[] downloadThreads = new Thread[fileURLs.length];

        for (int i = 0; i < fileURLs.length; i++) {
            downloadThreads[i] = new DownloadThread(fileURLs[i], destinations[i]);
            downloadThreads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : downloadThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All downloads completed.");
    }
}
