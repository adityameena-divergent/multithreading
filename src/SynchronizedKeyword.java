/**
 * In this example thread-0 and main thread both increment calling incCount() method to increment the x varaible but only one thread can only execute incCount() method at a time because incCount is synchronized.
 */
public class SynchronizedKeyword extends Thread {

    static int x = 0;

    public void run() {
        for(int i = 1; i <= 50; i++) {
            incCount();
            if (x == 25) {
                Thread.yield();
            }
        }
    }

    public synchronized static void incCount() {
        x++;
        System.out.println(Thread.currentThread().getName() + " ----- " + x);

    }

    public static void main(String[] args) throws InterruptedException {

        SynchronizedKeyword thread = new SynchronizedKeyword();
        thread.start();

        for(int i = 1; i <= 50; i++) {
            incCount();
        }


    }
}
