package Task7;//package Task7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("\n*** 1 ***");
//        BigDecimal bd1 = new BigDecimal("10.50");
//        System.out.println("Big Decimal 1 value: " + bd1);
//        BigDecimal bd2 = new BigDecimal("2.25");
//        System.out.println("Big Decimal 2 value: " + bd2);
//        System.out.println("Sum: " + bd1.add(bd2));
//        System.out.println("Difference: " + bd1.subtract(bd2));
//        System.out.println("Product: " + bd1.multiply(bd2));
//        System.out.println("Quotient: " + bd1.divide(bd2, 2, RoundingMode.HALF_UP));
//
//        System.out.println(("\n*** 2 ***"));
//        BigDecimal valueFromString = new BigDecimal("0.1");
//        double valueFromDouble = 0.1;
//        System.out.println("Value from String: " + valueFromString);
//        System.out.println("Value from double: " + valueFromDouble);
//
//        System.out.println("\n*** 3 ***");
//        BigDecimal notRounded = new BigDecimal("10.56789");
//        BigDecimal rounded = notRounded.setScale(2, RoundingMode.HALF_UP);
//        System.out.println("Unrounded: " + notRounded);
//        System.out.println("Rounded: " + rounded);
//
//        System.out.println("\n*** 4 ***");
//        BigDecimal originalPrice = new BigDecimal("200.00");
//        BigDecimal discountPercent = new BigDecimal("25");
//        BigDecimal discountAmount = originalPrice.multiply(discountPercent.divide(new BigDecimal("100")));
//        BigDecimal finalPrice = originalPrice.subtract(discountAmount)
//                .setScale(2, RoundingMode.HALF_UP);
//        System.out.println("Price before discount: " + originalPrice + "\nAmount of Discount in %: " + discountPercent
//                + "\nFinal price: " + finalPrice);
//
//        System.out.println("\n*** 5 ***");
//        BigDecimal netPrice = new BigDecimal("399.00");
//        BigDecimal taxRate = new BigDecimal("0.23");
//        BigDecimal grossPrice = netPrice.multiply(BigDecimal.ONE.add(taxRate))
//                .setScale(2, RoundingMode.HALF_UP);
//        System.out.println("Net price: " + netPrice);
//        System.out.println("Tax rate: " + taxRate);
//        System.out.println("Gross price: " + grossPrice);
//
//        System.out.println("\n*** 6 ***");
//        BigDecimal price1 = new BigDecimal("21");
//        BigDecimal price2 = new BigDecimal("25");
//        System.out.println("Price one: " + price1 + "\nPrice two: " + price2);
//        int comparison = price1.compareTo(price2);
//        if (comparison > 0) {
//            System.out.println(price1 + " is greater than " + price2);
//        } else if (comparison < 0) {
//            System.out.println(price1 + " is smaller than " + price2);
//        } else {
//            System.out.println(price1 + " equals to " + price2);
//        }
//        System.out.println();
//        System.out.println("\n*** 7 ***");
//        BigDecimal[] itemPrices = {
//                new BigDecimal("19.99"),
//                new BigDecimal("34.50"),
//                new BigDecimal("8.75"),
//                new BigDecimal("45.00"),
//                new BigDecimal("12.30")
//                };
//        BigDecimal total = BigDecimal.ZERO;
//        for (BigDecimal item : itemPrices) {
//            total = total.add(item);
//        }
//        System.out.println("Sum of cart prices: " + total);
//
//        System.out.println("\n*** 8 ***");
//        System.out.print("Enter number of products: ");
//        int numberOfProducts = scanner.nextInt();
//        scanner.nextLine();
//        BigDecimal sum = BigDecimal.ZERO;
//        for (int i = 0; i < numberOfProducts; i++) {
//            System.out.print("Enter price of product " + (i + 1) + ": ");
//            BigDecimal price = scanner.nextBigDecimal();
//            sum = sum.add(price);
//        }
//        BigDecimal averagePrice = sum.divide(
//                BigDecimal.valueOf(numberOfProducts),
//                2,
//                RoundingMode.HALF_UP
//        );
//        System.out.println("Average price: " + averagePrice);
//        scanner.nextLine();
//
//        System.out.println("\n*** 9 ***");
//        System.out.print("Type in price in PLN: ");
//        BigDecimal plnPrice = new BigDecimal(scanner.nextLine());
//        System.out.print("Put EUR exchange rate (eg.: 4.30): ");
//        BigDecimal exchangeRate = new BigDecimal(scanner.nextLine());
//        BigDecimal eurPrice = plnPrice.divide(exchangeRate, 2, RoundingMode.HALF_UP);
//        System.out.println("Price in EUR: " + eurPrice);
//        System.out.println();
//
//        System.out.println("\n*** 10 ***");
//        double doubleSum = 0.1 + 0.2;
//        BigDecimal bigDecimalOne = new BigDecimal("0.1");
//        BigDecimal bigDecimalTwo = new BigDecimal("0.2");
//        BigDecimal bigDecimalSum = bigDecimalOne.add(bigDecimalTwo);
//        System.out.println("Sum of double 0.1 + 0.2 = " + doubleSum);
//        System.out.println("Sum of BigDecimal 0.1 + 0.2 = " + bigDecimalSum);
//
//        System.out.println("\n*** 11 ***");
//        System.out.println("Type in a sentence: ");
//        String sentence1 = scanner.nextLine();
//        System.out.println("Sentence lenght: " + sentence1.length());
//        System.out.println("Sentence in uppercase: " + sentence1.toUpperCase());
//        System.out.println("Sentence in lowercase: " + sentence1.toLowerCase());
//        String reversed = new StringBuilder(sentence1).reverse().toString();
//        System.out.println("Sentence in reverse: " + reversed);
//
//        System.out.println("\n*** 12 ***");
//        System.out.println("Type a sentence: ");
//        String sentence2 = scanner.nextLine();
//        System.out.println("Type a word: ");
//        String word1 = scanner.nextLine();
//        if (sentence2.contains(word1)) {
//            System.out.println("The word appears in the sentence");
//        } else {
//            System.out.println("The word does not appear in the sentence");
//        }
//
//        System.out.println("\n*** 13 ***");
//        System.out.println("Type in a sentence: ");
//        String sentence3 = scanner.nextLine();
//        String changedSentence = sentence3.replace(" ", "_").replace(",", "");
//        System.out.println("Changed sentence: " + changedSentence);
//
//        System.out.println("\n*** 14 ***");
//        System.out.println("Type in String no.1: ");
//        String string1 = scanner.nextLine();
//        System.out.println("Type in String no.2: ");
//        String string2 = scanner.nextLine();
//        boolean equals = string1.equals(string2);
//        boolean equalsIgnoreCase = string1.equalsIgnoreCase(string2);
//        System.out.println("Equality using `equals()` -> " + equals + "\n`equalsIgnoreCase()`. -> " + equalsIgnoreCase);
//
//        System.out.println("*** 15 ***");
//        System.out.println("Enter a sentence: ");
//        String sentence4 = scanner.nextLine();
//        String[] words = sentence4.split(" ");
//        for (String word : words) {
//            System.out.println(word);
//        }

        System.out.println("*** 16 ***");
        System.out.println("Enter text: ");
        String sentence5 = scanner.nextLine();
        if (sentence5.startsWith("Java")) {
            System.out.println("The text starts with 'Java'");
        } else {
            System.out.println("The text does not start with 'Java'");
        }

        if (sentence5.endsWith("2025")) {
            System.out.println("The text ends with '2025'");
        } else {
            System.out.println("The text does not end with '2025");
        }
    }
}
