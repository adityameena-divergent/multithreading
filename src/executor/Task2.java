package executor;

public class Task2 extends Thread {

    public void run() {
        System.out.println("\nTask2 Started");

        for (int i = 201; i < 300; i++)
            System.out.print(i + " ");
        System.out.print("\nTask2 Done");

    }

}
