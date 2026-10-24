import java.lang.reflect.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TestPerson testPerson = new TestPerson("Leva", 18, "Russia");
        Class<TestPerson> testPersonClass = TestPerson.class;

        for (Method method : testPersonClass.getDeclaredMethods()) {
            System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
        }
    }
}
