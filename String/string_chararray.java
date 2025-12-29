import java.util.Scanner;
public class string_chararray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    char[] arr = s.toCharArray();
    for(char c : arr){
        System.out.println(c+" ");
    }
    }
}
