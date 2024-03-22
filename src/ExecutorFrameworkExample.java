import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author romeo.jerenyama
 * @created 19/01/2024 - 15:25
 */
public class ExecutorFrameworkExample {
    public static void main(String[] args) {
        // Creating a fixed-size thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submitting tasks to the thread pool
        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " executed by thread: " + Thread.currentThread().getName());
            });
        }

        // Shutting down the thread pool
        executorService.shutdown();
    }
}
