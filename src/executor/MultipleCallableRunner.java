package executor;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableTask> tasks = List.of(new CallableTask("John"), new CallableTask("Cena"));

       List<Future<String>> results = executorService.invokeAll(tasks);

        for (Future<String> r : results) {
            System.out.println(r.get());
        }

        executorService.shutdown();

    }
}
