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

        System.out.println("\n*** 6 ***");
        BigDecimal price1 = new BigDecimal("21");
        BigDecimal price2 = new BigDecimal("25");
        System.out.println("Price one: " + price1 + "\nPrice two: " + price2);
        int comparison = price1.compareTo(price2);
        if (comparison > 0) {
            System.out.println(price1 + " is greater than " + price2);
        } else if (comparison < 0) {
            System.out.println(price1 + " is smaller than " + price2);
        } else {
            System.out.println(price1 + " equals to " + price2);
        }
        System.out.println();

        System.out.println("\n*** 7 ***");
        BigDecimal[] itemPrices = {
                new BigDecimal("19.99"),
                new BigDecimal("34.50"),
                new BigDecimal("8.75"),
                new BigDecimal("45.00"),
                new BigDecimal("12.30")
                };
        BigDecimal total = BigDecimal.ZERO;
        for (BigDecimal item : itemPrices) {
            total = total.add(item);
        }
        System.out.println("Sum of cart prices: " + total);
    }
}
