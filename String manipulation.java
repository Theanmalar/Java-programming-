// String manipulation 
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        System.out.println("Reversed String: " + reverseString(word));
        System.out.println("Number of Vowels: " + countVowels(word));
        System.out.println("Is Palindrome ?: " + isPalindrome(word));
        sc.close();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }
}
