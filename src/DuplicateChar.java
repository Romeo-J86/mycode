import java.util.HashSet;
import java.util.Set;

/**
 * @author romeo.jerenyama
 * @created 03/12/2023 - 17:35
 */
public class DuplicateChar {
    public static void main(String[] args) {
        System.out.println(duplicateChar("abcedabc"));
    }
    static int duplicateChar(String word){
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (set.contains(currentChar)) {
                return i;
            }
            set.add(currentChar);
        }

        return -1;
    }
}
