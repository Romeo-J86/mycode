/**
 * @author romeo.jerenyama
 * @created 27/01/2024 - 22:49
 */
import java.util.*;

public class JSONDifferenceService {
    public static void main(String[] args) {
        String json1 = "{\"name\": \"John\", \"age\": 25, \"city\": \"New York\"}";
        String json2 = "{\"name\": \"John\", \"age\": 30, \"city\": \"Los Angeles\"}";

        List<String> differingKeys = getJSONDiff(json1, json2);
        System.out.println("Differing keys: " + differingKeys);
    }

    public static List<String> getJSONDiff(String json1, String json2) {
        Map<String, String> map1 = parseJSON(json1);
        Map<String, String> map2 = parseJSON(json2);

        List<String> differingKeys = new ArrayList<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && !map1.get(key).equals(map2.get(key))) {
                differingKeys.add(key);
            }
        }

        Collections.sort(differingKeys);
        return differingKeys;
    }

    private static Map<String, String> parseJSON(String json) {
        Map<String, String> resultMap = new HashMap<>();
        String[] keyValuePairs = json.substring(1, json.length() - 1).split(",");

        for (String pair : keyValuePairs) {
            String[] entry = pair.split(":");
            String key = entry[0].trim().replace("\"", "");
            String value = entry[1].trim().replace("\"", "");
            resultMap.put(key, value);
        }

        return resultMap;
    }
}
