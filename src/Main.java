import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Bus bus = new Bus();
//        bus.Honk();
//        bus.Honk("Дзинь");
//        bus.Honk("Бип", 5);
//        bus.Honk(false, "Бип");

//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        Animal[] array = {dog, cat};
//
//        AnimalWorld animalWorld = new AnimalWorld();
//        animalWorld.getAnimal(array);

        Bus2 bus = new Bus2();
        bus.Honk();
        bus.move(30);
        bus.refuel(100);
        System.out.println(bus.toString());
    }
}
