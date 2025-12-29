import java.util.Scanner;
public class MissingLettersfound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence : ");
    String s = sc.nextLine().toLowerCase();
    System.out.print("Missing letters : ");
    for(char ch ='a';ch<='z';ch++){
        boolean found = false;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == ch){
            found =true;
            break;
        }
    }
    if(!found){
        System.out.print(ch+" ");
    }
    }
}
}
