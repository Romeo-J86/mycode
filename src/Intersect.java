import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author romeo.jerenyama
 * @created 16/01/2024 - 13:37
 */
public class Intersect {

    public static void main(String[] args) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] nums1 = new int[]{1,2,2,1};

        // Count occurrences in nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(countMap);

    }
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences in nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();

        // Find the intersection based on occurrences in nums2
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                intersectionList.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // Convert the List to an array
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }

        return result;

    }
}
