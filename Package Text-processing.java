// Text processing 
package textprocessing;

public class Statements {
    public static String formatText(String text) {
        return text.trim().toUpperCase();
    }

    public static boolean isValid(String text) {
        return text != null && !text.isEmpty();
    }
}

// In another file, use:
import textprocessing.Statements;

public class TextApp {
    public static void main(String[] args) {
        String input = " Hello, Everyone! ";
        System.out.println("Formatted Text: " + Statements.formatText(input));
        System.out.println("Is Valid: " + Statements.isValid(input));
    }
}
