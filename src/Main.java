import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 4;
        int i3 = 0;

        Print(IsEven(i1));
        Print(IsEven(i2));
        Print(IsEven(i3));

        Scanner scaner = new Scanner(System.in);

        Print(DayWeek((scaner.nextByte())));
        Print(DayWeek((scaner.nextByte())));
        Print(DayWeek((scaner.nextByte())));

    }

     static String IsEven(int number) {
        String result = "Число " + number + " ";
        if ((number % 2) == 0) {
                result += "Чётное";
        }else if(!((number % 2) == 0)) {
            result += "Нечётное";
        }else {
            result = "n/a";
        }
        return result;
    }

    static void Print(String text){
        System.out.println(text);
    }

    static String DayWeek(byte dayNumber) {
        String text = "";
        switch (dayNumber) {
            case 1:
                text = "Понедельник";
                break;
            case 2:
                text = "Вторник";
                break;
            case 3:
                text = "Среда";
                break;
            case 4:
                text = "Четверг";
                break;
            case 5:
                text = "Пятница";
                break;
            case 6:
                text = "Суббота";
                break;
            case 7:
                text = "Воскресенье";
                break;
            default:
                text = "Такого нету";
        }
        return text;
    }
}
