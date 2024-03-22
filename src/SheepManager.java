import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author romeo.jerenyama
 * @created 27/02/2024 - 14:30
 */
public class SheepManager {
    static volatile int sheepCount = 0;
    static AtomicInteger atomicInteger = new AtomicInteger();
    static void incrementAndReport() {
        System.out.print((++sheepCount)+" ");
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(20);
//        new Thread(() -> {
//            for (int i = 0; i < 5; i++){
//                incrementAndReport();
//            }
//        }).start();
//        new Thread(() -> {
//            for (int i = 0; i < 5; i++){
//                incrementAndReport();
//            }
//        }).start();
        try {
            service.execute(() -> {
                for (int i = 0; i < 10; i++){
                    incrementAndReport();
                }
            });
        }finally {
            service.shutdown();;
        }
    }
}
