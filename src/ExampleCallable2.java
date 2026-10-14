import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.*;

class ExampleCallable2 implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            String fileName = threadName + "_" + i + ".txt";
            fileList.add(fileName);
            try (OutputStream ou = new FileOutputStream(fileName);
                 BufferedOutputStream bos = new BufferedOutputStream(ou)) {
                bos.write(("Java" + i).getBytes());
                bos.flush();
            }
        }

        Thread.sleep(1000);
        return fileList;
    }
}
