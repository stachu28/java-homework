package Task10;

public final class MinMax {
    private MinMax() {
    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("IllegalArgumentException: Array empty!");
        }
        T min = arr[0];
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalArgumentException("IllegalArgumentException: Array element cannot be null!");
            }
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return Pair.of(min, max);
//        dlaczego Pair[first=min, second=max] a nie min=min, max=max
    }
}