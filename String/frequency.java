import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    System.err.println("Enter the char to find: ");
    char ch =sc.next().charAt(0);
    int count =0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == ch){
            count++;
        }
    }
    System.out.println("Frequency of "+ch+ " is : " +count);
}
}