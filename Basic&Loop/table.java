
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication table");
        for(int i=1;i<=16;i++){
            System.out.println(i+ " x " +num+" = " +(num*i));
        }
    }
}
