import java.util.Scanner;
public class startswithword {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    System.out.println("Enter a starting word : ");
    String Word = sc.nextLine();
    boolean start = true;
    if(Word.length()>s.length()){
         start = false;
    }
    else{
    for(int i =0;i<Word.length();i++){
        if(s.charAt(i)!= Word.charAt(i)){
            start =false;
        }
    }
    }
    System.out.println(start?"Starts with the word":"Does not starts ");
}
}