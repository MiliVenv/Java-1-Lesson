import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Day.MONDAY);
//        System.out.println(Day.MONDAY.isWorkingDay);
//
//        for (Day day : Day.values()) {
//            System.out.println(day + " " + day.isWorkingDay + " " + day.HoursWorking);
//        }
        Pair<Day, Integer>[] array = new Pair[7];
        int i = 0;
        Random random = new Random();
        for (Day day : Day.values()) {
            array[day.ordinal()] = new Pair<>(day, random.nextInt(7));
        }
        for (Pair p : array) {
            System.out.println(p.getKey() + " " + p.getValue() + " " + ((Day) p.getKey()).HoursWorking);
        }
    }

    public enum Day {
        MONDAY(true, 8), TUESDAY(true, 8),
        WEDNESDAY(true, 8), THURSDAY(true, 8),
        FRIDAY(true, 8), SATURDAY(false, 0),
        SUNDAY(false, 0);

        private boolean isWorkingDay;
        private int HoursWorking;

        Day(boolean isWorkingDay, int HoursWorking) {
            this.isWorkingDay = isWorkingDay;
            this.HoursWorking = HoursWorking;
        }

    }
}
