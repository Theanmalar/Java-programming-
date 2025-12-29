import java.util.Scanner;
public class numpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int temp = num;
        int rev =0;
        while(num!=0){
            rev = rev*10 +num%10;
            num /= 10;
        }
        System.out.println("Reversed Number : "+rev);
        if(temp==rev){
            System.err.println("Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
       
    }
}