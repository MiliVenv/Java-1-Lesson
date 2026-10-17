import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ArrayList<String> array = new ArrayList();
//
//        array.add("a1");
//        array.add("a2");
//        array.add("a3");
//        array.add("a1");
//
//        System.out.println(array.stream().filter("a1"::equals).count());
//        System.out.println(array.stream().findFirst().orElse("0"));
//        System.out.println(array.stream().skip(array.size() - 1).findFirst().orElse("Empty"));
//        System.out.println(array.stream().filter("a3"::equals).findFirst().get());
//        System.out.println(array.stream().skip(2).findFirst().get());
//        System.out.println(array.stream().skip(1).limit(2).collect(Collectors.toList()));
//
        People people = new People("Вася", 18 , Sex.MAN);
        People people2 = new People("Петя", 22 , Sex.MAN);
        People people3 = new People("Никита", 34 , Sex.MAN);
        People people4 = new People("Арина", 67 , Sex.WOMEN);
        People people5 = new People("Василина", 54 , Sex.WOMEN);
        People people6 = new People("Соня", 18 , Sex.WOMEN);

        Collection<People> arr = new ArrayList<>();
        arr.add(people);
        arr.add(people2);
        arr.add(people3);
        arr.add(people4);
        arr.add(people5);
        arr.add(people6);
//
//        List<People> arr1 = arr.stream()
//                .filter(a -> a.sex == Sex.MAN)
//                .filter(a -> a.age >= 18 && a.age <= 27)
//                .collect(Collectors.toList());
//
//        for (People peo : arr1) {
//            System.out.println(peo.age + ", " + peo.sex + ", " + peo.name);
//        }
//
//        double avr = arr.stream().filter(p -> p.sex == Sex.MAN).mapToInt(People::getAge).average().getAsDouble();
//        System.out.println(avr);
//
//        List<People> arr1 = arr.stream()
//                .filter(a -> a.age >= 18)
//                .filter(a -> (a.sex == Sex.MAN && a.age >= 18 && a.age <= 60) || (a.sex == Sex.WOMEN && a.age >= 18 && a.age <= 55))
//                .collect(Collectors.toList());
//
//        for (People peo : arr1) {
//            System.out.println(peo.age + ", " + peo.sex + ", " + peo.name);
//        }

        arr.stream().sorted(new PeopleAgeComparator().thenComparing(new PeopleNameComparator())).forEach(System.out::println);

    }
}

class PeopleAgeComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getAge() - o2.getAge();
    }
}

class PeopleNameComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.name.compareTo(o2.name);
    }
}