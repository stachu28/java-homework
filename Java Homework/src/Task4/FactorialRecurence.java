package Task4;

public class FactorialRecurence {
    static void main(String[] args) {
        System.out.println(silniaRek(4));
        System.out.println(silniaRek(5));
        System.out.println(silniaRek(6));
    }

    private static int silniaRek(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not definied for negative numbers");
        } if (n == 0 || n == 1) {
            return 1;
        }
        return n * silniaRek(n - 1);
    }
}
