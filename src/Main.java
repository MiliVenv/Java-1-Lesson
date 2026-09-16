public class Main {

    public static void main(String[] args) {
        int i = 4;
        i++;
        System.out.println(i);

        int j = 3;
        System.out.println(i % j);

        System.out.println(i == j);

        System.out.println(!(i == j));

        System.out.println((i + j) < 10 && i*j > 100);

        System.out.println((i + j) < 10 || i*j > 100);
    }

}
