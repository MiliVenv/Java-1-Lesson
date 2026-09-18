import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Car opel = new Car();
//        opel.model = "Opel";
//        opel.color = "Жёлтый";
//        opel.volume = 45;
//        opel.fuelLevel = 15;
//        opel.fuelConsumtion = 8;
//
//        opel.move(10, 10, 100, 100);
//
//        Car bmw = new Car();
//        opel.model = "BMW";
//        opel.color = "Чёрный";
//        opel.volume = 60;
//        opel.fuelLevel = 60;
//        opel.fuelConsumtion = 12;
//
//        opel.move(10, 10, 500, 500);

        Car opel = new Car("Opel");
        opel.color = "Жёлтый";
        Car bmw = new Car("BMW");
        bmw.color = "Синий";
        System.out.println(opel.color);
        System.out.println(bmw.color);

    }
}
