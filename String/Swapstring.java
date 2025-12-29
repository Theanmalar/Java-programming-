import java.util.Scanner;
public class Swapstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string A : ");
        String a = sc.nextLine();
        System.out.println("Enter the string B : ");
        String b = sc.nextLine();
        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
}
