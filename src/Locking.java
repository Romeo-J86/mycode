import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author romeo.jerenyama
 * @created 27/02/2024 - 15:17
 */
public class Locking {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(() ->
                printHello(lock)).start();
        if(lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    private static void printHello(Lock lock) {
    }
}
