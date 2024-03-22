import java.util.Arrays;

/**
 * @author romeo.jerenyama
 * @created 16/02/2024 - 15:42
 */
public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int counter = 0;

        for(int num : nums){

            if(num != 0){
                nums[counter++] = num;
            }
        }
        while(counter < nums.length){
            nums[counter++] = 0;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
