import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static ReentrantLock rl;
    private static int count = 0;

    public static void incrementCount() {
        rl.lock();

        try {
            count++;
        } finally {
            rl.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        rl = new ReentrantLock();

        Thread thread1 = new Thread(() -> {
            for(int i = 1; i <= 100000; i++) {
                incrementCount();
            }
        });
        thread1.start();
        Thread.sleep(1);
        System.out.println(count);

        Thread thread2 = new Thread(() -> {
            for(int i = 1; i <= 100000; i++) {
                incrementCount();
            }
        });
        thread2.start();
        Thread.sleep(1);
        System.out.println(count);

    }
}
