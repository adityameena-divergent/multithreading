/**
 * Thread implementation using Runnable interface with lambda expression
 */
public class ThreadImplementationExample1 {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();

        for(int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }


    }
}