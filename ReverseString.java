import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        String stringToReverse = args[0];
        String reverseString = reverseString(stringToReverse);

        System.out.println("Original string: " + stringToReverse);
        System.out.println("Reversed string: " + reverseString);
    }

    public static String reverseString(String stringToReverse) {
        String reverseString = "";
        
        /*for(char c : stringToReverse.toCharArray()) {
            outString = c + reverseString;
        }*/

        // Build up reversed string character by character
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reverseString += stringToReverse.charAt(i);
        }

        return reverseString;
    }
}
