package Task6;

public class Main {
    static void main(String[] args) {
        System.out.println("*** 1 ***");
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Today is: " + today);

        System.out.println("\n*** 2 ***");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        System.out.println("\n*** 3 ***");
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.MONDAY;
        DayOfWeek day3 = DayOfWeek.TUESDAY;

        System.out.println("Is 'day1' same as 'day2': ");
        System.out.println(day1 == day2);
        System.out.println("Is 'day1' same as 'day3': ");
        System.out.println(day1 == day3);

        System.out.println("\n*** 4 ***");
        DayOfWeek day = DayOfWeek.WEDNESDAY;
        switch (day) {
            case MONDAY -> System.out.println("The beginning of the week!");
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Mid-week!");
            case SATURDAY, SUNDAY -> System.out.println("Weekend!");
        }
    }
}
