import java.util.logging.Level;

/**
 * Two thread have same runnable reference, both thread increment the x variable by 1 and printing it.
 */
public class SharedRunnableObject {

    public static int x = 0;

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " ----- " + ++x);
            }
            RaceConditionExample.logger.log(Level.FINE, Thread.currentThread().getName() + " is finished");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

    }

}
