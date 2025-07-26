//  Interface
interface Payment {
    void makePayment();
}

class PaymentDetails {
    String accountNumber;
    String name;

    // Constructor
    public PaymentDetails(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    // Method to display payment details
    public void showPaymentDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
    }
}

class CreditCardPayment extends PaymentDetails implements Payment {
    
    // Constructor to initialize account number and name
    public CreditCardPayment(String accountNumber, String name) {
        super(accountNumber, name);  // Call the constructor of the superclass
    }

    //Override
    public void makePayment() {
        showPaymentDetails();
        System.out.println("Payment made using Credit Card.");
    }
}

class PayPalPayment extends PaymentDetails implements Payment {
    
    // Constructor to initialize account number and name
    public PayPalPayment(String accountNumber, String name) {
        super(accountNumber, name);  // Call the constructor of the superclass
    }

    //Override
    public void makePayment() {
        showPaymentDetails();
        System.out.println("Payment made using PayPal.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("111", "Dhee");
        Payment p2 = new PayPalPayment("777", "Aarav");

        p1.makePayment();
        p2.makePayment();
    }
}
