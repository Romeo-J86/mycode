import java.util.ArrayList;
import java.util.List;

/**
 * @author romeo.jerenyama
 * @created 27/03/2024 - 11:05
 */
public class GreatestNumber {
    public static void main(String[] args) {
        int number = 123456789;
        List<Integer> greatestNums = greatestNumbers(number);
        System.out.println("Input number: " + number);
        System.out.println("List of greatest numbers starting from input: " + greatestNums);
    }
    public static List<Integer> greatestNumbers(int number) {
        List<Integer> result = new ArrayList<>();
        int currentMax = -1; // Initialize current maximum

        // Convert the input number to a string for easier manipulation
        String numStr = String.valueOf(number);

        // Iterate through each digit of the number
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));

            // If the digit is greater than the current maximum, update the current maximum
            if (digit > currentMax) {
                currentMax = digit;
                result.clear(); // Clear the result list since we found a greater number
            }

            // Add the digit to the result list
            result.add(currentMax);
        }

        return result;
    }
}
