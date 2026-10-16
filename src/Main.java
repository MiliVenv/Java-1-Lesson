import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Callable<String> callable = new CallableExample(LocalDateTime.of(2026, 10, 16, 2, 0, 0));

        Future<String> future = executorService.submit(callable);

        String result = future.get();
        System.out.println("Финальный результат: " + result);

        executorService.shutdown();
    }
}
