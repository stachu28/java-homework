package Task4;

public class FactorialRecurence {
    static void main(String[] args) {
        System.out.println(factorialRecu(4));
        System.out.println(factorialRecu(5));
        System.out.println(factorialRecu(6));
    }

    private static int factorialRecu(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not definied for negative numbers");
        } if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecu(n - 1);
    }
}
