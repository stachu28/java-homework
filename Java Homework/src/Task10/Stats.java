package Task10;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data.length == 0 || data == null) {
            throw new IllegalArgumentException("IllegalArgumentException: Array cannot be empty");
        }
        this.data = data;
    }

    public double mean() {
        double sum = 0;
        for (T value : data) {
            sum += value.doubleValue();
        }
        return sum / data.length;
    }

    public double variance() {
        double sum = 0;
        for (T value : data) {
            double difference = value.doubleValue() - mean();
            sum += difference * difference;
        }
        return sum / data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        return Math.abs(mean() - other.mean()) <= eps;
    }
}