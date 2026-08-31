package Task6;

public enum Currency {
    PLN("zł"),
    USD("$"),
    EUR("€");

    @Override
    public String toString() {
        return name() + "(" + symbol + ").";
    }

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
