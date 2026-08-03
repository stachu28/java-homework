package Task8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneOffsetTransition;

public class FlightTimeFactory {

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
}