import java.util.Scanner;
public class endswithword {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    System.out.println("Enter a starting word : ");
    String Word = sc.nextLine();
    int start = s.length()-Word.length();
    boolean match = true;
    if(start<0){
      match = false;
    }
    else{
        for(int i=0;i<Word.length();i++){
            if(s.charAt(start+i)!=Word.charAt(i)){
                match = false;
                break;
            }
        }
    }
    System.out.print(match?"Ends with the word":"Does not end ");
}
}