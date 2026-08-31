package Task10;

import java.util.Arrays;

public class StatsTest {
    static void main(String[] args) {
        System.out.println("\n* Mean and Variance (Integer) *");
        Integer[] a = {1, 2, 3, 4};
        Stats<Integer> stats1 = new Stats<>(a);
        System.out.println(Arrays.toString(a));
        System.out.println("mean: " + stats1.mean());
        System.out.println("variance: " + stats1.variance());

        System.out.println("\n* Comparison of Averages with Tolerance *");
        Double[] x = {2.0, 2.0};
        Double[] y = {2.001, 1.999};
        double eps = 0.01;
        Stats<Double> stats2 = new Stats<>(x);
        Stats<Double> stats3 = new Stats<>(y);
        System.out.println("array 'x': " + Arrays.toString(x));
        System.out.println("array 'y': " + Arrays.toString(y));
        System.out.println("'x' and 'y' has the same mean: " + stats2.hasSameMean(stats3, eps));

        System.out.println("\n* Empty Array *");
        try {
            Stats<Double> empty = new Stats<>(new Double[]{});
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}