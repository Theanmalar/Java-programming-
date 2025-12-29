import java.util.Scanner;
public class MostRepeatedchar{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    char maxchar =' ';
    int count = 0;
    int maxcount = 0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) ==' '){
            continue;
        }
        count = 0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
        }
        if(count>maxcount){
            maxcount = count;
            maxchar = s.charAt(i);
        }
    }
    System.out.println("The Most repeated char is : "+maxchar+" and it's count : "+maxcount);
}
}