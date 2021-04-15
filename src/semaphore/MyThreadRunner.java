package semaphore;

import java.util.concurrent.Semaphore;

/**
 * It is runner class for MyThread
 */
public class MyThreadRunner {
    public static void main(String[] args) {


        Semaphore s = new Semaphore(3);

        MyThread t1 = new MyThread("t1", s);
        MyThread t2 = new MyThread("t2", s);
        MyThread t3 = new MyThread("t3", s);
        MyThread t4 = new MyThread("t4", s);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
