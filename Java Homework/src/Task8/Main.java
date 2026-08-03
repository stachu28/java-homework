package Task8;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    static void main(String[] args) {
        Task1();
        Task2();

    }

    private static void Task2() {
        ZonedDateTime departure = ZonedDateTime.of(2025, 01, 15, 23, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01, 16, 01, 30, 00, 00, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO102", "WAW", "WAW", departure, arrival);


    }

    private static void Task1() {
        System.out.println("\n*** 1 ***");
        ZonedDateTime departure = ZonedDateTime.of(2025, 01, 15, 10, 00, 00, 00, ZoneId.of("Europe/Warsaw"));
        ZonedDateTime arrival = ZonedDateTime.of(2025, 01, 15, 12, 30, 00, 00, ZoneId.of("Europe/Warsaw"));

        Flight flight = new Flight("LO101", "WAW", "WAW", departure, arrival);

        System.out.println(flight.calculateFlightDuration());

        Duration duration = flight.calculateFlightDuration();

        System.out.println(
                duration.toHours() + "h " +
                        (duration.toMinutes() % 60) + "m"
        );
    }
}
//    * Wylot: `2025-01-15 23:00:00 (Europe/Warsaw)`
//        * Przylot: `2025-01-16 01:30:00 (Europe/Warsaw)`
//        * **Oczekiwane:** `2h 30m`
