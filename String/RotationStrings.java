import java.util.Scanner;
public class RotationStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String1 : ");
    String s1 = sc.nextLine();
    System.err.println("Enter the String2: ");
    String s2 = sc.nextLine();
    if(s1.length() == s2.length()){
        String temp= s1+s1;
        if(temp.contains(s2))
        System.out.println("Rotation");
        else
        System.out.println("Not a Rotation");
    }
    }
}
