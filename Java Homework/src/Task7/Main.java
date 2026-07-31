package Task7;//package Task7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    static void main(String[] args) {

        System.out.println("\n*** 1 ***");
        BigDecimal bd1 = new BigDecimal("10.50");
        System.out.println("Big Decimal 1 value: " + bd1);
        BigDecimal bd2 = new BigDecimal("2.25");
        System.out.println("Big Decimal 2 value: " + bd2);
        System.out.println("Sum: " + bd1.add(bd2));
        System.out.println("Difference: " + bd1.subtract(bd2));
        System.out.println("Product: " + bd1.multiply(bd2));
        System.out.println("Quotient: " + bd1.divide(bd2, 2, RoundingMode.HALF_UP));

        System.out.println(("\n*** 2 ***"));
        BigDecimal valueFromString = new BigDecimal("0.1");
        double valueFromDouble = 0.1;
        System.out.println("Value from String: " + valueFromString);
        System.out.println("Value from double: " + valueFromDouble);

        System.out.println("\n*** 3 ***");
        BigDecimal notRounded = new BigDecimal("10.56789");
        BigDecimal rounded = notRounded.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Unrounded: " + notRounded);
        System.out.println("Rounded: " + rounded);

        System.out.println("\n*** 4 ***");
        BigDecimal originalPrice = new BigDecimal("200.00");
        BigDecimal discountPercent = new BigDecimal("25");
        BigDecimal discountAmount = originalPrice.multiply(discountPercent.divide(new BigDecimal("100")));
        BigDecimal finalPrice = originalPrice.subtract(discountAmount)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Price before discount: " + originalPrice + "\nAmount of Discount in %: " + discountPercent
                + "\nFinal price: " + finalPrice);

        System.out.println("\n*** 5 ***");
        BigDecimal netPrice = new BigDecimal("399.00");
        BigDecimal taxRate = new BigDecimal("0.23");
        BigDecimal grossPrice = netPrice.multiply(BigDecimal.ONE.add(taxRate))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Net price: " + netPrice);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Gross price: " + grossPrice);
    }
}
