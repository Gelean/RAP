import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        String stringToReverse = args[0];
        String reverseString = reverseString(stringToReverse);

        System.out.println("Original string: " + stringToReverse);
        System.out.println("Reversed string: " + reverseString);
    }

    public static String reverseString(String stringToReverse) {
        char[] originalSringCharArray = new char[stringToReverse.length()];
        String reverseString = "";

        /*for (char c: originalSringCharArray) {
            System.out.println(c);
        }*/

        // Copy character by character into array
        for (int i = 0; i < stringToReverse.length(); i++) {
            originalSringCharArray[i] = stringToReverse.charAt(i);
        }

        // Build up reversed string character by character
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reverseString += stringToReverse.charAt(i);
        }

        return reverseString;
    }
}