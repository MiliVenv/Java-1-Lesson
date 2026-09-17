import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] += 100;
        }

        System.out.println(Arrays.toString(array));

        for (int element : array) {
            System.out.println(element % 100);
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int maxNumber = array[0];
        for (int element : array) {
            if (maxNumber < element) maxNumber = element;
        }
        System.out.println(maxNumber);

        int sumNumber = 0;
        for (int element : array) {
            sumNumber += element;
        }
        System.out.println(sumNumber);
    }
}
