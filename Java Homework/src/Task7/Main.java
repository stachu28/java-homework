package Task7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    static void main(String[] args) {

        System.out.println("\n*** 1 ***");
        BigDecimal bd1 = new BigDecimal("10.50");
        System.out.println("Big Decimal 1 value: " + bd1);
        BigDecimal bd2 = new BigDecimal("2.25");
        System.out.println("Big Decimal 2 value: " +bd2);
        System.out.println("Sum: " + bd1.add(bd2));
        System.out.println("Difference: " + bd1.subtract(bd2));
        System.out.println("Product: " + bd1.multiply(bd2));
        System.out.println("Quotient: " + bd1.divide(bd2, 2, RoundingMode.HALF_UP));
    }
}
