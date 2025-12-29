import java.util.Scanner;
public class PalindromeWithoutReverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
       boolean ispalindrome = true;
       int start = 0;
       int end =s.length()-1;
       while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            ispalindrome =false;
            break;
        }
        start++;
        end--;
       }
       System.out.print(ispalindrome?"Palindrome":"Not a palindrome");
    }
}
