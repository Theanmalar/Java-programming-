import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class ValidateStrongPassword {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String pwd = sc.nextLine();
    boolean upper =false,lower=false,digit=false,special=false;
    if(pwd.length()>=8){
        for(int i=0;i<pwd.length();i++){
            char c = pwd.charAt(i);
            if(c>='A' && c<='Z')
            upper = true;
            else if(c>='a' && c<='z')
            lower = true;
            else if(c>=0 && c<='9')
            digit = true;
            else
            special = true;
        }
    }
    if(upper && lower && digit && special){
        System.out.println("Strong password ");
    }
    else{
        System.out.println("Weak Password ");
    }
    }
}
