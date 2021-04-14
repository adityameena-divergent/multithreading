/**
 * In this example thread-0 will execute until main thread is executing.
 */

public class DaemonThreadExample {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i = 1; i <= 100; i++) {
                System.out.println("Daemon Thread " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread " + i);
        }

    }
}
