import java.util.Arrays;

/**
 * @author romeo.jerenyama
 * @created 24/11/2023 - 15:06
 */
public class Palindrome {
    public static void main(String[] args) {
        String source = "My name is nitin and I can speak malayalam";

        // Convert the source String into an array of words
        String[] words = source.trim().split("\\s+");
        Arrays.stream(words).filter(Palindrome::isPalindrome)
                .forEach(System.out::println);

    }
    static boolean isPalindrome(String source){
        int left = 0;
        int right = source.length() - 1;
        while (left < right){
            if (source.charAt(left++) != source.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
