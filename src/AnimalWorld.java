import java.util.Random;

public class AnimalWorld {

    void getAnimal(Animal[] array) {
        Random random = new Random();
        for (int i = 0; i <= array.length * 10; i++) {
            array[random.nextInt(array.length)].Voice();
        }
    }

}
