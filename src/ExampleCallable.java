import java.io.File;
import java.util.concurrent.Callable;

public class ExampleCallable implements Callable {

    private String word;

    public ExampleCallable(String word) {
        this.word = word;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " " + word.length());
        return Integer.valueOf(word.length());
    }
}
