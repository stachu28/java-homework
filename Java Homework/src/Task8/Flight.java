package Task8;

import java.time.ZonedDateTime;

public class Flight {
    private final String flightNumber;
    private final String departureAirport;
    private final String arrivalAirport;
    private final ZonedDateTime departureTime;
    private final ZonedDateTime arrivalTime;

    public Flight(String flightNumber,
                  String departureAirport,
                  String arrivalAirport,
                  ZonedDateTime departureTime,
                  ZonedDateTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}
