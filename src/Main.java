import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Runnable runnable = () -> System.out.println("Hello World");
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        String[] list = new String[]{"asdasd", "asdasdasd", "dasdasdasd"};
//        String[] list2 = new String[]{"asdas", "asdasd"};
//
//        List<String[]> arrays = new ArrayList<>();
//        arrays.add(list);
//        arrays.add(list2);
//
//        arrays.sort((o1, o2) -> o1.length - o2.length);
//
//        for (String[] arr : arrays) {
//            System.out.println(Arrays.toString(arr));
//        }

//        @FunctionalInterface
//        interface MathInterface<T> {
//            T getMax(T first, T second);
//        }
//
//        MathInterface<Integer> m = (first, second) -> {
//            if (first > second) return first;
//            return second;
//        };
//
//        System.out.println(m.getMax(1, 2));

        @FunctionalInterface
        interface Operation<T> {
            T operation(List<Integer> list);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        Operation<Integer> m = (List<Integer> list) -> {
            int sum = 0;
            for (int number : list) {
                sum += number;
            }
            return sum;
        };
        Operation<String> m2 = (List<Integer> list) -> {
            StringBuilder sb = new StringBuilder();
            for (int number : list) {
                sb.append(number);
            }
            return sb.toString();
        };
        Operation<Integer> m3 = (List<Integer> list) -> {
            int sum = 0;
            for (int number : list) {
                sum *= number;
            }
            return sum;
        };
        if (list2.size() > 20) {
            System.out.println(m.operation(list2));
            System.out.println("1");
        }else if(list2.size() > 10) {
            System.out.println(m2.operation(list2));
            System.out.println("2");
        }else {
            System.out.println(m3.operation(list2));
            System.out.println("3");
        }
    }
}
