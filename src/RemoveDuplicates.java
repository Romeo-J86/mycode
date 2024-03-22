import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author romeo.jerenyama
 * @created 17/02/2024 - 12:09
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums){
        Set<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return 0;
    }
}
