/**
 * Changing the priority of thread-2 from default 5 to 6
 * Changing the priority of thread-1 from default 5 to 10 when value of i is greater then 5
 */

public class ThreadPriority {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            for(int i = 1; i <= 10; i++) {
                if(i > 5)
                    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                System.out.println(Thread.currentThread().getName() + " ----- " + i + " ----- Thread Priority : " + Thread.currentThread().getPriority());
            }
        };

        Runnable runnable2 = () -> {
            Thread.currentThread().setPriority(6);
            for(int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " ----- " + i + " ----- Thread Priority : " + Thread.currentThread().getPriority());
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}
