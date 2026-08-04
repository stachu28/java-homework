package Task8;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.ZonedDateTime;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;

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

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(ZonedDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}