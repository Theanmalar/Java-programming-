import java.util.Scanner;
public class eachwordreverse {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine() + " ";
        String rev = "",word = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                word = s.charAt(i) + word;
            }
            else{
                rev = rev+word+" ";
                word = " ";
            }
        }
        System.out.println(rev);
    }
}
