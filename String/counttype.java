import java.util.Scanner;
public class counttype {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    int upper =0,lower=0,digit=0,special=0;
    for(int i=0;i<s.length();i++){
        char c =s.charAt(i);
        if(c>='A' && c<='Z'){
            upper++;
        }
        else if(c>='a' && c<='z'){
            lower++;
        }
        else if(c>='0' && c<='9'){
            digit++;
        }
        else{
            special++;
        }
    }
    System.out.println("Upper : "+upper);
    System.out.println("Lower : "+lower);
    System.out.println("Digits :" +lower);
    System.out.println("Special : "+special);
}
}
