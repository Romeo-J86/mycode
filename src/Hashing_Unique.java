import java.util.*;

/**
 * @author romeo.jerenyama
 * @created 12/02/2024 - 21:58
 */
public class Hashing_Unique {
    public static void main(String[] args) {
        count("aansmnkk");
        System.out.println(findNumbers(new int[]{5, 2, 3,3}));
    }
    static List<Integer> findNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(map.get(i), map.getOrDefault(i, 0) + 1);
        }
        int totalCount = 0;
        for (int count: map.values()){
            if (count > 1){
                totalCount += count;
            }
        }
        System.out.println(totalCount);
        System.out.println(map);
        Set<Integer> numSet = new HashSet<>();

        Arrays.stream(nums).forEach(numSet::add);

        return numSet.stream()
                .filter(num -> !numSet.contains(num + 1) && !numSet.contains(num - 1))
                .toList();

    }
    static void count(String str){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }

}
