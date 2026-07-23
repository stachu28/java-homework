package Task4;

public class AverageOfThreeNumbers {
    static void main(String[] args) {
        double result = averageOf(3, 4, 6);

        System.out.printf("%.2f", result);
    }

    private static double averageOf(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
