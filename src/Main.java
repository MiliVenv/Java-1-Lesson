import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cycleTest();
    }

    static void cycleTest() {
        for(int i = 0; i<= 8; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
