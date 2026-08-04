package Task8;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.ZonedDateTime;

public class Flight {
    String flightNumber;
    String departureAirport;
    String arrivalAirport;
    ZonedDateTime departureTime;
    ZonedDateTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, ZonedDateTime departureTime,
                  ZonedDateTime arrivalTime) {
        if (arrivalTime.toInstant().isBefore(departureTime.toInstant())
                || arrivalTime.toInstant().equals(departureTime.toInstant())) {
            throw new IllegalArgumentException("Arrival must be after departure");
        }
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Duration calculateFlightDuration() {
        return Duration.between(departureTime.toInstant(), arrivalTime.toInstant());
    }


}