import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {

    private volatile long seconds;

    public CallableExample(LocalDateTime dateTime) {

        this.seconds = Duration.between(dateTime, LocalDateTime.now()).toSeconds();
    }

    @Override
    public String call() throws Exception {

        while (seconds > 0) {
            System.out.println("Thread " + Thread.currentThread().getName() + " Секунд осталось: " + this.seconds);
            seconds--;
        }

        return "Thread " + Thread.currentThread().getName() + " завершил отсчет!";
    }
}
