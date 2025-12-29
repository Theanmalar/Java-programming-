import java.util.Scanner;
public class LongestSmallestword {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence : ");
    String s = sc.nextLine();
    s+=" ";
    String word ="";
    String longest = "";
    String smallest = "";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=' '){
            word+=s.charAt(i);
        }else{
            if(word.length()>0){
                if(smallest.equals("")){
                    smallest =word;
                }
                if(word.length()>longest.length()){
                    longest=word;
                }
                if(word.length()<smallest.length()){
                    smallest=word;
                } 
            }
            word = "";
        }
    }
    System.out.println("Longest Word : "+longest);
    System.out.println("Smallest Word : "+smallest);
    }
}
