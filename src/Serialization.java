import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * @author romeo.jerenyama
 * @created 14/02/2024 - 09:49
 */
public class Serialization {
    public static void main(String[] args) {
        String[] array1 = {"Apple", "Banana", "Orange"};
        String[] array2 = {"Cat", "Dog", "Fish"};

        String filePath = "arrays.ser";


        // Serialize arrays
        serializeArrays(array1, array2, filePath);
        System.out.println("Arrays serialized successfully.");

        // Deserialize arrays
        String[][] deserializedArrays = deserializeArrays(filePath);
        if (deserializedArrays != null) {
            System.out.println("Arrays deserialized successfully:");
            System.out.println("Array 1: " + Arrays.toString(deserializedArrays[0]));
            System.out.println("Array 2: " + Arrays.toString(deserializedArrays[1]));
        }
    }
    static void serializeArrays(String[] arr1, String[] arr2, String filePath){
        try(var objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Path.of(filePath)))){
            objectOutputStream.writeObject(arr1);
            objectOutputStream.writeObject(arr2);
        }catch (IOException e){
            e.getMessage();
        }
    }
    static String[][] deserializeArrays(String filePath){
        try(var objectInputStream = new ObjectInputStream(Files.newInputStream(Path.of(filePath)))){
            String[] arr1 = (String[]) objectInputStream.readObject();
            String[] arr2 = (String[]) objectInputStream.readObject();
            return new String[][]{arr1, arr2};
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }
}
