import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        LocalDate specificdATE = LocalDate.of(2017, Month.JULY, 30);
//        System.out.println(specificdATE);
//
//        LocalDate epohDate = LocalDate.ofEpochDay(365);
//        System.out.println(epohDate);
//
//        LocalDate day2502017 = LocalDate.ofYearDay(2017, 250);
//        System.out.println(day2502017);

//        LocalTime time = LocalTime.now();
//        System.out.println("Получаем текущее время : " + time);
//
//        LocalTime specificTime = LocalTime.of(23, 15, 11, 22);
//        System.out.println("Какое-то время дня : " + specificTime);
//
//        LocalTime sec2000 = LocalTime.ofSecondOfDay(2000);
//        System.out.println("Через 2000 секунд после 00:00 : " + sec2000);
//
//        // Получаем текущее время
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Получаем текущее время : " + today);
//
//        // Создаем новую дату с помощью LocalDate и LocalTime
//        // Исправлено: добавлены точки после .now() для корректного вызова методов
//        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
//        System.out.println("DateTime : " + today);
//
//        // Создаем LocalDateTime передавая в качестве аргументов
//        // год, месяц, день, час, минуту, секунду
//        LocalDateTime randDate = LocalDateTime.of(2017, Month.JULY, 9, 11, 6, 22);
//        System.out.println("LocalDateTime с указанной датой : " + randDate);
//
//        // Получаем дату через 2000 секунд после 01.01.1970
//        // Примечание: в методе используется временная зона UTC
//        LocalDateTime dateFromBase =
//                LocalDateTime.ofEpochSecond(2000, 0, ZoneOffset.UTC);
//        System.out.println("Через 2000 секунд после 01.01.1970 : " + dateFromBase);
//
//        // Создаем объекты ZoneId для работы с часовыми поясами
//        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
//        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
//
//        // Выводим информацию о временной зоне
//        System.out.println(zone1);
//
//        // Получаем текущее время для индийского часового пояса (Kolkata)
//        LocalTime time1 = LocalTime.now(zone1);
//        System.out.println("India Time Zone: " + time1);
//
//        // Получаем текущее время для японского часового пояса (Tokyo)
//        LocalTime time2 = LocalTime.now(zone2);
//        System.out.println("Japan Time Zone: " + time2);
//
//        LocalDate date = LocalDate.now();
//
//        // стандартный формат даты
//        System.out.println("стандартный формат даты для LocalDate : " + date);
//        // применяем свой формат даты
//        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
//        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
//
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        // стандартный формат даты
//        System.out.println("стандартный формат даты для LocalDateTime : " + dateTime);
//        // применяем свой формат даты
//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
//        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
//
//        Instant timestamp = Instant.now();
//
//        // стандартный формат даты
//        System.out.println("стандартный формат даты для Instant : " + timestamp);

        LocalDate date2 = LocalDate.of(2008, 10, 10);
        LocalDate date1 = LocalDate.of(2026, 10, 10);

        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        System.out.println(date1.minusYears(date2.getYear()).getYear());

    }
}