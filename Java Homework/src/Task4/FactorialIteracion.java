package Task4;

public class FactorialIteracion {
    static void main(String[] args) {
        System.out.println(silniaIter(4));
        System.out.println(silniaIter(5));
        System.out.println(silniaIter(6));
    }

    private static int silniaIter(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Factorial is not definied for negative numbers");
        }

        int result = 1;
        for (int j = 2; j <= i; j++) {
            result *= j;
        }
        return result;
    }
}
