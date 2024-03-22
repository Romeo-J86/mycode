/**
 * @author romeo.jerenyama
 * @created 01/03/2024 - 11:21
 */
public class PalTest {

    public static void main(String[] args) {

    }
    boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left <= right){
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
