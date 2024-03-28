/**
 * @author romeo.jerenyama
 * @created 17/02/2024 - 12:09
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums){
        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
