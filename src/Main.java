import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Director DirectorA = Director.getInstance("Вася");
        System.out.println(DirectorA.getName());
        Director DirectorB = Director.getInstance("Петя");
        System.out.println(DirectorA.getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    DirectorThread DirectorA = DirectorThread.getInstance("пЕТЯ");
                    System.out.println(DirectorA + " " + DirectorA.getName());
                }
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);
        pool.submit(runnable);
        pool.shutdown();
    }
}
