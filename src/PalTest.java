import java.util.ArrayList;
import java.util.List;

/**
 * @author romeo.jerenyama
 * @created 01/03/2024 - 11:21
 */
public class PalTest {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println();
        System.out.println("Greatest numbers....!");
        System.out.println(greatestNumbers(new int[]{12,34,567,89}));
        System.out.println();
        System.out.println("Reversing number...");
        System.out.println(reverseInt(4568));

    }
    static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    static int reverseInt(int num){
        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        return Integer.parseInt(sb.toString());
    }

    static List<Integer> greatestNumbers(int[] numbers){

        List<Integer> result = new ArrayList<>();
        int tempMaxValue = -1;

        for (int num : numbers){
            String strNum = String.valueOf(num);

            for (int i = 0; i < strNum.length(); i++){
                int digit = Character.getNumericValue(strNum.charAt(i));

                if (digit > tempMaxValue){
                    tempMaxValue = digit;
                }
            }
            result.add(tempMaxValue);
            tempMaxValue = -1;
        }
        return result;
    }
}
