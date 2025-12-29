import java.util.Scanner;
public class vowelconstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character from a-z or A-Z  : ");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Constant");
        }

    }
} 
