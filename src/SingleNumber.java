/**
 * @author romeo.jerenyama
 * @created 16/02/2024 - 15:52
 */
public class SingleNumber {

    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //
    //You must implement a solution with a linear runtime complexity and use only constant extra space.
    //Constraints:
    //
    //1 <= nums.length <= 3 * 104
    //-3 * 104 <= nums[i] <= 3 * 104
    //Each element in the array appears twice except for one element which appears only once.

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,5,5,3,3}));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;

        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
