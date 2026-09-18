import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите логин: ");
//            System.out.println(getFormartLogin(scanner.next()));
//            System.out.println(replaceSecondWord("CAT DOG", "CAT"));

        Numbers("4444r7777777r999999999");
    }

    static String getFormartLogin(String str) {
        str = str.toLowerCase().trim();
        return str;
    }

    static String replaceSecondWord(String str1, String str2) {
        int start = str1.indexOf(" ");
        String word = str1.substring(start + 1);
        if (word.equals(str2)) System.out.println("Замена бесмысленая");
        else str1 = str1.substring(0, start + 1) + str2;

        return str1;
    }

    static void Numbers(String str) {
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(str);
        int count = 0;
        String numbers = "";
        while (matcher.find()) {
            if (count < matcher.end() - matcher.start()) {
                count = matcher.end() - matcher.start();
                numbers = matcher.group();
            }else {
                continue;
            }
        }
        System.out.println(numbers + " " + count);
    }
}
