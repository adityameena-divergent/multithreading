package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

//        Task 3
        System.out.println("\nTask3 Started");

        for (int i = 201; i < 300; i++)
            System.out.print(i + " ");
        System.out.print("\nTask3 Done");

        executorService.shutdown();
    }
}
