import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author romeo.jerenyama
 * @created 21/03/2024 - 19:44
 */
public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    /*
    * Given an array of integers nums and an integer target, return indices of the two
    * numbers such that they add up to target.You may assume that each input would have
    *  exactly one solution, and you may not use the same element twice.
    * You can return the answer in any order.
    */

    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store indices of elements
        Map<Integer, Integer> numIndices = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement
            // Check if complement exists in the map
            if (numIndices.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numIndices.get(complement), i};
            }
            // Otherwise, put the current number and its index in the map
            numIndices.put(nums[i], i);
        }
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
