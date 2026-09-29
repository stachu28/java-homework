package Task4;

public class SumOfDigitsRacurence {
    static void main(String[] args) {
        System.out.println(sumOfDigitsRecu(12345));

    }
    static int sumOfDigitsRecu(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigitsRecu(n / 10);
    }
}
