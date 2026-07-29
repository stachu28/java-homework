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
    }
}
