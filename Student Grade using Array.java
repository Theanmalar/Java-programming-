// Student grade
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] marks = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Mark for student " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            total += marks[i];
        }

        double average = total / n;
        System.out.println("Average marks: " + average);
        for (int i = 0; i < n; i++) {
            System.out.println("Grade for student " + (i + 1) + ": " + Grade(marks[i]));
        }
        sc.close();
    }

    public static String Grade(double marks) {
        if (marks >= 85) {
            return "Excellent A!";
        } else if (marks >= 70) {
            return "Great job B!";
        } else if (marks >= 65) {
            return "Good  C!";
        } else if (marks >= 45) {
            return " pass D.";
        } else {
            return "Sorry failed.";
        }
    }
}
