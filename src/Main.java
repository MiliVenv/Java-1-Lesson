public class Main {

    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 4;

        Print("Число " + IsEven(i1));
        Print("Число " + IsEven(i2));
        PrintDefault();
    }

     static boolean IsEven(int number) {
        return (number % 2) == 0;
    }

    static void Print(String text){
        System.out.println(text);
    }

    static void PrintDefault() {
        System.out.println("Изучаем методы");
    }
}
