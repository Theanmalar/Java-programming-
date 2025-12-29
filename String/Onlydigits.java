import java.util.Scanner;
public class Onlydigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    boolean onlydigits= true;
    for(int i =0;i<s.length();i++){
        if(s.charAt(i)<'0'||s.charAt(i)>'9'){
            onlydigits = false;
            break;
        }
    }
   System.out.println(onlydigits?"Only digits":"Not only digits");
    }
}
