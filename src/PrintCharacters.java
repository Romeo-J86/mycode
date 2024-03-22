import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author romeo.jerenyama
 * @created 21/11/2023 - 19:00
 */
public class PrintCharacters {
    public static void main(String[] args) {
        String str = "How are you Techie";
        String[] words = str.trim().split("\\s+");

        Arrays.stream(words).forEach(s -> System.out.print(s.charAt(0) + " "));

        int[] arr = new int[]{4,5,2,1,3,3,5,6,5,6,7};
        IntStream distinct = Arrays.stream(arr).distinct().sorted();
        System.out.println();
        distinct.forEach(System.out::println);
        Arrays.stream(arr).filter(value -> value != 1).forEach(System.out::println);

        moveZeros(new int[]{1,0,7,5,0,4,0});

    }
    static int[] moveZeros(int[] nums){

        int counter = 0;
        for (int num : nums){
            if (num != 0){
                nums[counter++] = num;
            }
        }
        while (counter < nums.length){
            nums[counter++] = 0;
        }
        System.out.println("Move zeros");
        Arrays.stream(nums).forEach(System.out::print);
        return nums;
    }
}
