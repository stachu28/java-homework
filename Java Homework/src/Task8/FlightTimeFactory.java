package Task8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneOffsetTransition;
import java.util.Map;

public class FlightTimeFactory {

    private static final Map<String, String> IATA_TO_ZONE = Map.of(
            "WAW", "Europe/Warsaw",
            "JFK", "America/New_York",
            "LHR", "Europe/London",
            "NRT", "Asia/Tokyo",
            "LAX", "America/Los_Angeles",
            "DEL", "Asia/Kolkata",
            "SIN", "Asia/Singapore"
    );

    public static ZonedDateTime create(LocalDateTime localTime, String zoneName) {

        ZoneId zone = ZoneId.of(zoneName);
        ZoneOffsetTransition transition = zone.getRules().getTransition(localTime);

        if (transition != null && transition.isGap()) {
            throw new InvalidFlightTimeException(
                    "Podana godzina lokalna " + localTime + " nie istnieje w strefie "
                            + zoneName + " z powodu zmiany na czas letni (spring-forward)."
            );
        }

        return ZonedDateTime.of(localTime, zone);
    }

    public static void validateOrder(ZonedDateTime departure, ZonedDateTime arrival) {
        if (!arrival.toInstant().isAfter(departure.toInstant())) {
            throw new InvalidFlightTimeException(
                    "Czas przylotu (" + arrival + ") musi być po czasie wylotu ("
                            + departure + ") w ujęciu Instant."
            );
        }
    }

    public static ZoneId zoneForAirport(String iataCode) {
        String zoneName = IATA_TO_ZONE.get(iataCode);
        if (zoneName == null) {
            throw new IllegalArgumentException("Nieznany kod IATA: " + iataCode);
        }
        return ZoneId.of(zoneName);
    }

    public static ZonedDateTime toZonedDateTime(LocalDateTime localDateTime, ZoneId zone) {
        return ZonedDateTime.of(localDateTime, zone);
    }

    public static ZonedDateTime fromAirportLocalTime(String iataCode, LocalDateTime localDateTime) {
        ZoneId zone = zoneForAirport(iataCode);
        return toZonedDateTime(localDateTime, zone);
    }
}