import java.util.Scanner;
public class palindromicwords_count {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine() + " ";
    String word = "";
    int count = 0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) != ' '){
            word += s.charAt(i);
        }
        else{
            if(word.length()>0){
            String rev ="";
            for(int j=word.length()-1;j>=0;j--){
                rev += word.charAt(j);
            }
                if(word.equalsIgnoreCase(rev)){
                    count++;
            }
             word = "";
        }
    }
}
    System.out.println("Palindromic words count : "+count);
    }
}
