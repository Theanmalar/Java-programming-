import java.util.Scanner;    //it is used to change the case of char - u-l,l-u 
import javax.lang.model.util.ElementScanner14;
public class Togglecase {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine() + " ";
    String res = " ";
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c>='a' && c<='z')
        res+=(char)(c-32);
        else if(c>='A'&& c>='Z')
        res+=(char)(c+32);
        else
        res +=c;
    }
    System.out.println(res);
    }
}
