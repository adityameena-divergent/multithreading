/**
 * Thread implementation by extending Thread class
 */
public class ThreadImplementationExample2 extends Thread {

    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }


    public static void main(String[] args) {

        ThreadImplementationExample2 thread = new ThreadImplementationExample2();

        thread.start();

        for(int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }

    }
}
