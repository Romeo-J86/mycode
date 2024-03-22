import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author romeo.jerenyama
 * @created 05/12/2023 - 17:20
 */
public class MaxValue {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{2,4,2,4,1,5,3}));

        char[] chars = new char[]{'a','b','c','d','e'};
        var s = String.valueOf(chars);
        var sb = new StringBuilder();
        int left = 0;
        int right = s.length() - 1;

        while (left <= right){
            sb.append(s.charAt(right--));
        }
        System.out.println(sb);
    }

    static int maxValue(int[] arr){
        return Arrays.stream(arr).max().orElse(-1);
    }
}
