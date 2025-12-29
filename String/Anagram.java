import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {     
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the String 1 : ");     // we can also perform this using built in functions
    String s1 = sc.nextLine();
    System.out.println(" Enter the String 2 : ");
    String s2 = sc.nextLine();
    s1.toLowerCase();
    s2.toLowerCase();
    if(s1.length()!=s2.length()){
        System.out.println("Not Anagarms");
        return;
    }
    int count[] = new int[256];
    for(int i =0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
   for(int i=0;i<256;i++){
    if(count[i]!=0){
        System.err.println("Not Anagrams");
        return;
    }
   }
    System.out.println("Strings are Anagrams ");
}
}
