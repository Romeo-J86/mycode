import java.util.Arrays;
import java.util.List;

/**
 * @author romeo.jerenyama
 * @created 17/11/2023 - 15:25
 */
public class Example {
    public static void main(String[] args) {
//        var sentences = new String[]{"Hello world", "Welcome to the jungle", "This is a test"};
//        var words = Arrays.stream(sentences).flatMap(sentence -> sentence.split(" ")).toArray();
//// words: ['Hello', 'world', 'Welcome', 'to', 'the', 'jungle', 'This', 'is', 'a', 'test']
        List<String> strings = Arrays.asList("Java is great", "FlatMap example", "Stream API");
        var  s = "Method splits a string based on whitespace and produces an array of words";
        List<String> words = strings.stream()
                .flatMap(str -> Arrays.stream(str.split("\\s+"))) // Split each string into words
                .toList();

        var word = s.split("\\s+");
//        System.out.println("Words after using flatMap():");
//        words.forEach(System.out::println);
        Arrays.stream(word).filter(s1 -> s1.length() < 10).forEach(System.out::println);
    }
}
