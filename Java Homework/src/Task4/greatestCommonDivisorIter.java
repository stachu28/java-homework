package Task4;

public class greatestCommonDivisorIter {
    static void main(String[] args) {
        System.out.println(GCD(48, 12));
        System.out.println(GCD(48, 30));
        System.out.println(GCD(48, 61));
    }

    public static int GCD(int a, int b) {
        while (b !=0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }   return a;
    }

}
