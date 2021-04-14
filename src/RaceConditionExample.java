import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In this Runnable object is shared with two different thread,
 * both increasing count value at same time & then print it after loop is finished
 * But with synchronized block only thread can increment count variable at a time.
 */

public class RaceConditionExample {

    public static int x = 0;
    static Logger logger;
    static ConsoleHandler consoleHandler;

    static {
        logger = Logger.getAnonymousLogger();
        consoleHandler = new ConsoleHandler();
        logger.setLevel(Level.FINE);
        consoleHandler.setLevel(Level.FINE);
        logger.addHandler(consoleHandler);
    }

    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

    }

}

class MyRunnable implements Runnable {
    private int count = 0;

    public void run() {
        for(int i = 0; i < 1000000; i++) {
            synchronized (this) {
                this.count++;
            }
        }
        RaceConditionExample.logger.log(Level.FINE, "count = " + count);
    }
}