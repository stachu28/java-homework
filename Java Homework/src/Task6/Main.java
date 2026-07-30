package Task6;

import static Task6.MenuOption.START;
import static Task6.MenuOption.STOP;

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

        System.out.println("\n*** 11 ***");
        Month[] months = {Month.APRIL, Month.JUNE,
                Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.DECEMBER};
        int totalDays = 0;
        for (Month month : months) {
            System.out.println(month + " has: " + month.getDays() + " days.");
            totalDays += month.getDays();
        }
        System.out.println("In total they have: " + totalDays + " days.");

        System.out.println("\n*** 12 ***");
        for (Currency currency : Currency.values()) {
            System.out.println(currency.toString());
        }

        System.out.println("\n*** 13 ***");
        int a = 14;
        int b = 4;
        System.out.println("Calculator of: " + a + ", and: " + b);
        for (Operation operation : Operation.values()) {
            double result = operation.calculate(a, b);
            System.out.println(a + " " + operation + " " + b + " equals " + result);
        }

        System.out.println("\n*** 14 ***");
        OrderStatus status1 = OrderStatus.CANCELED;
        OrderStatus status2 = OrderStatus.DELIVERED;
        OrderStatus status3 = OrderStatus.PROCESSING;
        System.out.println(status1 + " is active: " + status1.isActive());
        System.out.println(status2 + " is active: " + status2.isActive());
        System.out.println(status3 + " is active: " + status3.isActive());

        System.out.println("\n*** 15 ***");
        for (Planet planet : Planet.values()) {
            System.out.println("name: " + planet + ", mass(t): " + planet.getMass() + ", radius(m): " + planet.getRadius()
                    + ", density: " + planet.getDensity() + ".");
        }

        System.out.println("\n*** 16 ***");
        Logger.INSTANCE.log("test");

        System.out.println("\n*** 17 ***");
        System.out.println("Choose option: ");
        for (MenuOption option : MenuOption.values()) {
            System.out.println("- " + option);
        }
        String userInput = "start";
        try {
            MenuOption option = MenuOption.valueOf(userInput.toUpperCase());

            switch (option) {
                case START -> System.out.println("You have launched the program!");
                case STOP -> System.out.println("You have stopped the program!");
                case EXIT -> System.out.println("You have exited the program!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawna opcja.");
        }

        System.out.println("\n*** 18 ***");
        Product[] products = {
                new Product("Laptop", Category.ELECTRONICS),
                new Product("Cheese", Category.FOOD),
                new Product("Hoodie", Category.CLOTHING),
        };
        for (Product product : products) {
            System.out.println("name: " + product.getName() + ", category: " + product.getCategory());
        }

        System.out.println("\n*** 19 ***");
        int c = 12;
        int d = 4;
        System.out.println("1st number is: " + c);
        System.out.println("2nd number is: " + d);
        System.out.println("Adding: " + Calculation.ADD.calculate(c, d));
        System.out.println("Subtracting: " + Calculation.SUBTRACT.calculate(c, d));
        System.out.println("Multiplying: " + Calculation.MULTIPLY.calculate(c, d));
        System.out.println("Dividing: " + Calculation.DIVIDE.calculate(c, d));

    }
}