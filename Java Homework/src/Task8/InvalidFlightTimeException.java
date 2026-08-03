package Task8;

public class InvalidFlightTimeException extends IllegalArgumentException {
    public InvalidFlightTimeException(String message) {
        super(message);
    }
}