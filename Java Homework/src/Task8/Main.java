package Task8;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    private static Duration duration;

    static void main(String[] args) {
        Task1();
        Task2();
        System.out.println("\n*** 3 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 01, 15, 10, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01, 15, 14, 00, 00, 00, ZoneId.of("America/New_York"));

        Flight flight = new Flight("LO103", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task2() {
        System.out.println("\n*** 1 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 01, 15, 23, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01, 16, 01, 30, 00, 00, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO102", "WAW", "WAW", departure, arrival);
        Duration duration = flight.calculateFlightDuration();
        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }

    private static void Task1() {
        System.out.println("\n*** 1 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 01, 15, 10, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01, 15, 12, 30, 00, 00, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO101", "WAW", "WAW", departure, arrival);

        Duration duration = flight.calculateFlightDuration();

        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m");
    }
}
