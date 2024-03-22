import java.util.Arrays;

/**
 * @author romeo.jerenyama
 * @created 16/02/2024 - 17:39
 */
public class PlusOne {

    public static void main(String[] args) {
        Arrays.stream(plusOne(new int[]{1,2,3})).forEach(System.out::println);
        int[] s = new int[]{10,20,15,22,35, 10, 22};
        Arrays.sort(s);
        int a = (int) Arrays.stream(s).distinct().count();
        System.out.println(a);
        System.out.println("Binary search....!");
        System.out.println(Arrays.binarySearch(s, 35));
    }
    public static int[] plusOne(int[] digits) {
        // Iterate from the least significant digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            // If the digit becomes less than 10 after increment, no need to propagate carry
            if (digits[i] < 10) {
                return digits;
            }
            // Otherwise, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }
        // If the loop completes without returning, it means there is a carry at the most significant digit
        // Create a new array with one more digit and set the most significant digit to 1
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }

}
