/**
 * @author romeo.jerenyama
 * @created 20/02/2024 - 13:42
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums)); // Output: 2
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        // Calculate the expected sum
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Return the missing number
        return expectedSum - actualSum;
    }
}
