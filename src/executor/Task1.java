package executor;

public class Task1 extends Thread {

    public void run() {
        System.out.println("\nTask1 Started");

        for (int i = 101; i < 200; i++)
            System.out.print(i + " ");
        System.out.print("\nTask1 Done");

    }

}
