import java.util.concurrent.atomic.AtomicInteger;

class Counter extends Thread {

    // Atomic counter Variable
    AtomicInteger count;

    Counter()
    {
        count = new AtomicInteger();
    }

    public void run()
    {

        int num = 1000000;

        for (int i = 0; i < num; i++) {
            count.addAndGet(1);
        }
    }
}

public class AtomicVariable {
    public static void main(String[] args)
            throws InterruptedException
    {

        Counter c = new Counter();

        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");

        first.start();
        second.start();

        // main thread will wait for both threads to complete execution
        first.join();
        second.join();

        System.out.println(c.count);
    }
}

