import java.util.Scanner;
public class countword {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence : ");
    String s = sc.nextLine()+" ";
    int count = 0;
    String n = s.trim()+" ";
    for(int i =0;i<s.length();i++){
        if(n.charAt(i) == ' ')
        count++;
    }
    System.out.println("Number of words in a sentence: " +count);
    }
}
