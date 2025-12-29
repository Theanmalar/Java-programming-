import java.util.Scanner;
public class space {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    String res = "";
    for(int i=0;i<s.length();i++){
        char c =s.charAt(i);
        if(c ==' '){
       res = res +'-';
        }
        else{
            res = res+c;
        }
    }
    System.out.println("After replacing spaces : "+res);
     String l = "";
    for(int i =0;i<s.length();i++){
        char c = s.charAt(i);
        if(c!=' '){
             l=l+c;
        }
    }
    System.out.println("After removing space : "+l);
}
}
