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

        System.out.println("Is 'day1' same as 'day2'?");
        System.out.println(day1 == day2);
        System.out.println("Is 'day1' same as 'day3'?");
        System.out.println(day1 == day3);

        System.out.println("\n*** 4 ***");
        DayOfWeek day4 = DayOfWeek.WEDNESDAY;
        switch (day4) {
            case MONDAY -> System.out.println("The beginning of the week!");
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Mid-week!");
            case SATURDAY, SUNDAY -> System.out.println("Weekend!");
        }

        System.out.println("\n*** 5 ***");
        DayOfWeek day5 = DayOfWeek.MONDAY;
        DayOfWeek day6 = DayOfWeek.SATURDAY;
        System.out.println("Is 'day5' a weekend?");
        System.out.println(DayOfWeek.isWeekend(day5));
        System.out.println("Is 'day5' a weekend?");
        System.out.println(DayOfWeek.isWeekend(day6));

        System.out.println("\n*** 6 ***");
        for (Month month : Month.values()) {
            System.out.println(month + " - " + month.getDays() + " days.");
        }

        System.out.println("\n*** 7 ***");
        for (Month month : Month.values()) {
            System.out.println(month.toString());
        }

        System.out.println("\n*** 8 ***");
        System.out.println("Months with Ordinals");
        for (Month month : Month.values()) {
            System.out.println("Month: " + month + ", ordinal: " + month.ordinal());
        }
        System.out.println("\nCompareTo examples:");
        Month m1 = Month.JANUARY;
        Month m2 = Month.AUGUST;
        Month m3 = Month.OCTOBER;

        System.out.println(m1 + " vs " + m2 + ": " + m1.compareTo(m2));
        System.out.println(m2 + " vs " + m3 + ": " + m2.compareTo(m3));
        System.out.println(m3 + " vs " + m1 + ": " + m3.compareTo(m1));

        System.out.println("\n*** 9 ***");
        for (Month month : Month.values()) {
            if (month.isHolidaySeason()) {
                System.out.println(month + " - miesiąc wakacyjny!");
            }
        }

        System.out.println("\n*** 10 ***");
        Person artur = new Person("Artur", DayOfWeek.SATURDAY);
        Person kate = new Person("Kate", DayOfWeek.WEDNESDAY);

        artur.showDayOff();
        kate.showDayOff();

    }
}
