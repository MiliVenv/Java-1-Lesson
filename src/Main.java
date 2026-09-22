import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Russia");
//        map.put(2, "Spain");
//        map.put(3, "Germany");
//        map.put(4, "Italy");
//        System.out.println(map.get(2));
//        Set<Integer> set = map.keySet();
//        System.out.println(set);
//        Collection<String> setValue = map.values();
//        System.out.println(setValue);
//        map.replace(1, "Poland");
//        map.remove(2);
//        System.out.println(setValue);
//        for (Map.Entry<Integer, String> item : map.entrySet()) {
//            System.out.println(item.getKey());
//            System.out.println(item.getValue());
//        }

        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        int count = random.nextInt(100);
        for (int j = 0; j <= count; j++) {
            array.add(random.nextInt(100));
        }
        for (int i = 0; i <= count; i++) {
            map.put(i, 0);
        }
        System.out.println(array);
        System.out.println(map);

        System.out.println(findDubl(array, map, count));
    }

    public static Map<Integer, Integer> findDubl(ArrayList<Integer> array, Map<Integer, Integer> map, int count) {

        for (int i = 0; i < count; i++) {
            int currentElement = array.get(i);
            map.put(currentElement, map.getOrDefault(currentElement, 0) + 1);
        }
        return map;
    }
}
