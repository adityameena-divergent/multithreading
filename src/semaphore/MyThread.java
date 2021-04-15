package semaphore;

import java.util.concurrent.Semaphore;

/**
 * This class has a parameterized constructor that take two argument one is thread name & second is semaphore object
 * Only limited number of thread can access critical section, we can pass no. of thread that access critical at same time in semaphore constructor
 */
public class MyThread extends Thread {
    private Semaphore s;

    MyThread(String name, Semaphore s) {
        super(name);
        this.s = s;
    }

    public void run() {
        try {

//            s.acquire();

            // only two thread are allow to enter a critical section
            s.acquire(2);
            for(int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " - " + i + " | Available Permits - " + this.s.availablePermits());
            }


        } catch (InterruptedException e) {}
//        s.release();

        // two release
        s.release(2);
    }

}
