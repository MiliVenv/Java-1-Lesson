import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(20));
        }
        Iterator<Integer> iterator = list.iterator();

        System.out.println(list);

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println(set);

//        List<Integer> list = new LinkedList<>();
//        Random random = new Random();
//
//        for (int i = 0; i < random.nextInt(100); i++) {
//            list.add(random.nextInt(100));
//        }
//
//        System.out.println(list);
//
//        int count = list.size();
//        for (int i = 0; i < count - i; i++) {
//            count--;
//            for (int j = 0; i < list.size(); i++) {
//
//                if (list.get(j) > list.get( + 1)) {
//                    int element = list.get(i);
//                    list.set(i, list.get(i + 1));
//                    list.set(i + 1, element);
//                }
//            }
//        }
//        System.out.println(list);
//    }
    }
}
