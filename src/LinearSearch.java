import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author romeo.jerenyama
 * @created 17/11/2023 - 21:26
 */
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(findNumber(new int[]{2,4,6,8,3}, 6));
        int[] a = {1,0,0,1,1,0};
        Arrays.sort(a);
        for (int b : a){
            System.out.println(b);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Ray", 102);
        map.put("Roy", 103);
        map.put("Rim", 104);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key:: " + key + " value:: " + value);
        }
    }
    static int findNumber(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return 0;
    }
}
