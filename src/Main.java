import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Programer Person = new Programer();
        Person.setFirstName("Василий");
        Person.setLastName("Петров");
        Person.setAge(16);
        Person.setHardSkils(HardSkils.Logic);
        Person.setSoftSkils(SoftSkils.Good);
        System.out.println(Person);

        Director director = new Director();
        System.out.println(director.getJunior(Rang.Junior));
        System.out.println(director.getMidle(Rang.Midlle));
        System.out.println(director.getSenior(Rang.Senior));
    }
}
