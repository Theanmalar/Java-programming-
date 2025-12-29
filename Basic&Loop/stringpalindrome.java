import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s1 = sc.nextLine();
        String rev = "";
        for(int i=s1.length()-1;i>=0;i--){
            rev = rev+s1.charAt(i);
        }
        System.out.println("Reversed string :"+rev);
        if(rev.equals(s1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}
