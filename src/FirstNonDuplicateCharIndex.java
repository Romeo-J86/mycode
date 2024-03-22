import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author romeo.jerenyama
 * @created 03/12/2023 - 20:14
 */
public class FirstNonDuplicateCharIndex {
    public static void main(String[] args) {
        System.out.println(firstNonDuplicateCharIndex("abcdabc"));
    }
    public static int firstNonDuplicateCharIndex(String word) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println("=================");
        System.out.println(charCount);
        System.out.println("=================");

        // Find the first character with a count of 1
        for (int i = 0; i < word.length(); i++) {
            if (charCount.get(word.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // Return -1 if no non-duplicate character found
    }
}