// Logging
import java.io.*;
import java.util.Scanner;

public class Logger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "log.txt";

        // Writing user inputs to a file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            System.out.print("Enter log message: ");
            String log = sc.nextLine();
            bw.write(log);
            bw.newLine();
            System.out.println("Log saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading the log from the file
        System.out.println("Displaying log contents:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        sc.close();
    }
}
