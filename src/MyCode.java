import java.time.LocalDateTime;
import java.util.*;

/**
 * @author romeo.jerenyama
 * @created 18/01/2024 - 13:41
 */
public class MyCode {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("printing values in stringArray");
        Arrays.stream(stringArray).forEach(System.out::println);
        list.clear();
        System.out.println(objectArray.length);     // 2
        System.out.println(stringArray.length);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        System.out.println(queue.peek());

        System.out.println(LocalDateTime.now());
        System.out.println("extractValues method..... ");
         int[] arr = extractValues(new int[]{2,3,4});
         for (int i : arr){
             System.out.print(i + " ");
         }
    }
    static int[] extractValues(int[] s){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }
}
