import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String rev = "";
        for(int i =0;i<s.length();i++){
            char c =s.charAt(i);
            rev = c+rev;
        }
        System.out.println("Reversed string : "+rev);
       if(rev.toLowerCase().equals(s.toLowerCase())){
        System.out.println("It is palindrome");
       }
       else{
        System.out.println("It is not palindrome");
       }

    }
}
