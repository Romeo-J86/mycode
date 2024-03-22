import java.util.*;
import java.util.stream.Collectors;

/**
 * @author romeo.jerenyama
 * @created 24/11/2023 - 13:11
 */
public class SortingHashMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ray", 123);
        map.put("Roy", 120);
        map.put("Rat", 119);
        map.put("Race", 121);

        System.out.println("Before sorting......!");
        System.out.println(map);
        System.out.println();
        LinkedHashMap<String, Integer> linkedHashMap = map.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a,
                        LinkedHashMap::new));

        System.out.println("After sorting.......!");
        System.out.println(linkedHashMap);

        int[] arr = new int[]{10,5,5,2,23,7};
//        OptionalInt min = Arrays.stream(arr).min();
        System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).max());
//        min.ifPresent(System.out::println);

        var array = new int[]{1,2,3,4,5};
        var s = Arrays.stream(array).reduce(0, Integer::sum);
        System.out.println("The sum of s is:: " + s);
    }
}
