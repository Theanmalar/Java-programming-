// Contact management 
import java.io.*;
import java.util.Scanner;

public class ContactManager {
    private static final String filename = "contacts.txt";

    public static void addContact(String name, String phone) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(name + "," + phone);
            bw.newLine();
            System.out.println("Contact saved.");
        } catch (IOException e) {
            System.out.println("Error saving contact: " + e.getMessage());
        }
    }

    public static void viewContacts() {
        System.out.println("Contact List:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] contact = line.split(",");
                System.out.println("Name: " + contact[0] + ", Phone: " + contact[1]);
            }
        } catch (IOException e) {
            System.out.println("Error reading contacts: " + e.getMessage());
        }
    }

    public static void deleteContacts() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.print("");
            System.out.println("All contacts deleted.");
        } catch (IOException e) {
            System.out.println("Error deleting contacts: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n The choices are\n1. Add Contact\n2. View Contacts\n3. Delete All Contacts\n4. Exit\n5.Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();
                    addContact(name, phone);
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    deleteContacts();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
