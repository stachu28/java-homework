package Task4;

public class greatestCommonDivisorRecur {
    static void main(String[] args) {
        System.out.println(GCD(4, 2));
        System.out.println(GCD(48, 12));
        System.out.println(GCD(48, 24));
        System.out.println(GCD(48, 26));
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
