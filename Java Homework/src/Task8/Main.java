package Task8;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    private static Duration duration;

    static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        System.out.println("\n*** 10 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 6, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 1, 15, 19, 0, 0, 0, ZoneId.of("Asia/Kolkata"));

        Flight flight = new Flight("LO110", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task9() {
        System.out.println("\n*** 9 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 1, 15, 19, 0, 0, 0, ZoneId.of("Asia/Kolkata"));

        Flight flight = new Flight("LO109", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task8() {
        System.out.println("\n*** 8 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 1, 15, 8, 0, 0, 0, ZoneId.of("Europe/Warsaw"));

        try {
            Flight flight = new Flight("LO108", "WAW", "WAW", departure, arrival);
            Duration duration = flight.calculateFlightDuration();
            System.out.println(
                    duration.toHours() + "h " +
                            (duration.toMinutes() % 60) + "m");
        } catch (IllegalArgumentException _) {
            System.out.println("Arrival must be after departure!");
        }
    }

    private static void Task7() {
        System.out.println("\n*** 7 ***");
        ZonedDateTime departure;
        ZonedDateTime arrival;

        try {
            departure = ZonedDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Invalid/Zone"));
            arrival = ZonedDateTime.of(2025, 10, 26, 2, 30, 0, 0, ZoneId.of("Europe/Warsaw"));
        } catch (DateTimeException e) {
            System.out.println("Invalid time zone!");
            return;
        }

        Flight flight = new Flight("LO107", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task6() {
        System.out.println("\n*** 6 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 10, 26, 2, 30, 0, 0, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO106", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task5() {
        System.out.println("\n*** 5 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 10, 26, 1, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 10, 26, 2, 30, 0, 0, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO105", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task4() {
        System.out.println("\n*** 4 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 3, 30, 1, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 3, 30, 5, 0, 0, 0, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO104", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task3() {
        System.out.println("\n*** 3 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 1, 15, 14, 0, 0, 0, ZoneId.of("America/New_York"));

        Flight flight = new Flight("LO103", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task2() {
        System.out.println("\n*** 1 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 23, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 1, 16, 1, 30, 0, 0, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO102", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task1() {
        System.out.println("\n*** 1 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 1, 15, 10, 0, 0, 0, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 1, 15, 12, 30, 0, 0, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO101", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }
}
