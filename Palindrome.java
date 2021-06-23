import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        String stringToReverse = args[0];
        String reverseString = ReverseString.reverseString(stringToReverse);

        if (isPalindrome(stringToReverse, reverseString)) {
            System.out.println(stringToReverse + " is a palindrome");
        } else {
            System.out.println(stringToReverse + " is not a palindrome");
        }
    }

    public static Boolean isPalindrome(String firstString, String secondString) {
        return firstString.equals(secondString);
    }
}
