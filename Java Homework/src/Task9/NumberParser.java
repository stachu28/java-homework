package Task9;

final class NumberParser {
    static int parsePositiveInt(String s) {
        try {
            int value = Integer.parseInt(s);
            if (value <= 0) {
                throw new IllegalArgumentException("non-positive: " + s + " value");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: '" + s + "'", e);
        }
    }
}