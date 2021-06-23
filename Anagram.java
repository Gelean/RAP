import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String firstString = args[0];
        String secondSring = args[1];

        if (isAnagram(firstString, secondSring)) {
            System.out.println(secondSring + " is an anagram of " + firstString);
        } else {
            System.out.println(secondSring + " is not an anagram of " + firstString);
        }
    }

    public static Boolean isAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        } else {
            char[] firstStringCharArray = new char[firstString.length()];
            char[] secondStringCharArray = new char[secondString.length()];
    
            // Copy character by character into arrays
            for (int i = 0; i < firstString.length(); i++) {
                firstStringCharArray[i] = firstString.toLowerCase().charAt(i);
            }
            for (int i = 0; i < secondString.length(); i++) {
                secondStringCharArray[i] = secondString.toLowerCase().charAt(i);
            }
            
            // Sort the arrays
            java.util.Arrays.sort(firstStringCharArray);
            java.util.Arrays.sort(secondStringCharArray);

            // Check if the two char arrays are equal
            for (int i = 0; i < firstString.length(); i++) {
                if (firstStringCharArray[i] != secondStringCharArray[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}