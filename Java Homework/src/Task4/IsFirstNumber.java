package Task4;

public class IsFirstNumber {
    static void main(String[] args) {
        System.out.println(czyPierwsza(4));
        System.out.println(czyPierwsza(2));
        System.out.println(czyPierwsza(5));

    }

    private static boolean czyPierwsza(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
