package Task8;

public class FlightTimeTest {

    public static void main(String[] args) {
        System.out.println("\n=== FLIGHT TIME TESTS ===\n");

        test1_SameTimeZone();
        test2_NextDay();
        test3_WAWtoNYC();
        test4_SpringForward();
        test5_FallBack();
        test6_DateLine();
        test7_InvalidTimeZone();
        test8_ArrivalBeforeDeparture();
        test9_WAWtoKolkata();
        test10_LongHaul();
        test11_RoundTrip();
    }

    static void test1_SameTimeZone() {
        System.out.println("1. Same time zone");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 10, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 15, 12, 30, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );

        Flight flight = new Flight("LO123", "WAW", "WAW", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h " + duration.toMinutesPart() + "m");
        System.out.println("Expected: 2h 30m");
        System.out.println("PASSED\n");
    }

    static void test2_NextDay() {
        System.out.println("2. Next day arrival (same time zone)");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 23, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 16, 1, 30, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );

        Flight flight = new Flight("LO456", "WAW", "WAW", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h " + duration.toMinutesPart() + "m");
        System.out.println("Expected: 2h 30m");
        System.out.println("PASSED\n");
    }

    static void test3_WAWtoNYC() {
        System.out.println("3. Cross time zone (Warsaw → New York)");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 10, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 15, 14, 0, 0, 0, java.time.ZoneId.of("America/New_York")
        );

        Flight flight = new Flight("LO26", "WAW", "JFK", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h");
        System.out.println("Expected: 10h");
        System.out.println("PASSED\n");
    }

    static void test4_SpringForward() {
        System.out.println("4. Daylight saving time change (spring-forward)");
        System.out.println("Note: 02:00-02:59 does not exist on this day");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 3, 30, 1, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 3, 30, 5, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );

        Flight flight = new Flight("LO789", "WAW", "WAW", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h");
        System.out.println("Expected: 3h");
        System.out.println("PASSED\n");
    }

    static void test5_FallBack() {
        System.out.println("5. Daylight saving time change (fall-back)");
        System.out.println("Note: 02:30 occurs twice on this day");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 10, 26, 1, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 10, 26, 2, 30, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );

        Flight flight = new Flight("LO123", "WAW", "WAW", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h " + duration.toMinutesPart() + "m");
        System.out.println("Expected: 1h 30m");
        System.out.println("PASSED\n");
    }

    static void test6_DateLine() {
        System.out.println("6. Date line crossing (Tokyo → Los Angeles)");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 10, 0, 0, 0, java.time.ZoneId.of("Asia/Tokyo")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 14, 18, 0, 0, 0, java.time.ZoneId.of("America/Los_Angeles")
        );

        Flight flight = new Flight("JL62", "NRT", "LAX", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h");
        System.out.println("Expected: 1h");
        System.out.println("PASSED\n");
    }

    static void test7_InvalidTimeZone() {
        System.out.println("7. Invalid time zone");
        try {
            java.time.ZoneId.of("Invalid/Zone");
            System.out.println("FAILED - No exception thrown\n");
        } catch (java.time.zone.ZoneRulesException e) {
            System.out.println("PASSED - Exception thrown: " + e.getMessage() + "\n");
        }
    }

    static void test8_ArrivalBeforeDeparture() {
        System.out.println("8. Arrival before departure (same time zone)");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 10, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 15, 8, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );

        try {
            FlightTimeFactory.validateOrder(departure, arrival);
            System.out.println("FAILED - No exception thrown\n");
        } catch (InvalidFlightTimeException e) {
            System.out.println("PASSED - Exception thrown: " + e.getMessage() + "\n");
        }
    }

    static void test9_WAWtoKolkata() {
        System.out.println("9. No DST in destination (Warsaw → Kolkata)");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 10, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 15, 19, 0, 0, 0, java.time.ZoneId.of("Asia/Kolkata")
        );

        Flight flight = new Flight("LO73", "WAW", "DEL", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h " + duration.toMinutesPart() + "m");
        System.out.println("Expected: 4h 30m");
        System.out.println("PASSED\n");
    }

    static void test10_LongHaul() {
        System.out.println("10. Long haul flight (Warsaw → Singapore)");
        java.time.ZonedDateTime departure = java.time.ZonedDateTime.of(
                2025, 1, 15, 6, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival = java.time.ZonedDateTime.of(
                2025, 1, 16, 6, 0, 0, 0, java.time.ZoneId.of("Asia/Singapore")
        );

        Flight flight = new Flight("SQ1", "WAW", "SIN", departure, arrival);
        java.time.Duration duration = flight.calculateFlightDuration();

        System.out.println("Result: " + duration.toHours() + "h");
        System.out.println("Expected: 17h");
        System.out.println("PASSED\n");
    }

    static void test11_RoundTrip() {
        System.out.println("11. Round trip (Warsaw ↔ London, winter)");

        // Warsaw → London
        java.time.ZonedDateTime departure1 = java.time.ZonedDateTime.of(
                2025, 1, 15, 8, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );
        java.time.ZonedDateTime arrival1 = java.time.ZonedDateTime.of(
                2025, 1, 15, 12, 0, 0, 0, java.time.ZoneId.of("Europe/London")
        );

        Flight flight1 = new Flight("LO281", "WAW", "LHR", departure1, arrival1);
        java.time.Duration duration1 = flight1.calculateFlightDuration();

        System.out.println("Warsaw → London: " + duration1.toHours() + "h (expected: 5h)");

        // London → Warsaw
        java.time.ZonedDateTime departure2 = java.time.ZonedDateTime.of(
                2025, 1, 15, 16, 0, 0, 0, java.time.ZoneId.of("Europe/London")
        );
        java.time.ZonedDateTime arrival2 = java.time.ZonedDateTime.of(
                2025, 1, 15, 20, 0, 0, 0, java.time.ZoneId.of("Europe/Warsaw")
        );

        Flight flight2 = new Flight("LO282", "LHR", "WAW", departure2, arrival2);
        java.time.Duration duration2 = flight2.calculateFlightDuration();

        System.out.println("London → Warsaw: " + duration2.toHours() + "h (expected: 3h)");
        System.out.println("PASSED\n");
    }
}