package Task12;

import java.util.*;
import java.util.function.*;

public class Main {
    static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
        Task11();
        Task12();
        Task13();
        Task14();
    }

    private static void Task14() {
        System.out.println("\n* Task 14 *");
        PriceStrategy normal = price -> price;
        PriceStrategy student = price -> price * 0.9;
        PriceStrategy vip = price -> price * 0.8;
        PriceStrategy blackFriday = price -> price * 0.7;

        Integer[] prices = {100, 250, 399};

        System.out.println("\nNormal price: ");
        for (double price : prices) {
            System.out.printf("Base price: %.2f after strategy application: %.2f%n", price, calculatePrice(price, normal));
        }

        System.out.println("\nStudent price: ");
        for (double price : prices) {
            System.out.printf("Base price: %.2f after strategy application: %.2f%n", price, calculatePrice(price, student));
        }

        System.out.println("\nVip price: ");
        for (double price : prices) {
            System.out.printf("Base price: %.2f after strategy application: %.2f%n", price, calculatePrice(price, vip));
        }

        System.out.println("\nBlack Friday price: ");
        for (double price : prices) {
            System.out.printf("Base price: %.2f after strategy application: %.2f%n", price, calculatePrice(price, blackFriday));
        }

    }

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }

    @FunctionalInterface
    interface PriceStrategy {
        double apply(double basePrice);
    }

    private static void Task13() {
        System.out.println("\n* Task 13 *");
        List<Product> products = new ArrayList<>();
        products.add(new Product("MacBook", 9000.00, 9));
        products.add(new Product("iPhone", 4500.00, 7));
        products.add(new Product("Laptop", 9000.00, 6));
        products.add(new Product("Smartfon", 4500.00, 5));
        System.out.println("List of products: " + products.toString());

        Comparator<Product> byPrice = (product1, product2) -> Double.compare(product1.price, product2.price);
        Comparator<Product> byRatingReverse = (product1, product2) -> Integer.compare(product1.rating, product2.rating);
        Comparator<Product> combined = byPrice.thenComparing(byRatingReverse);
        products.sort(combined);
        System.out.println("Products sorted by : " + products.toString());
    }

    record Product(String name, double price, int rating) {
    }

    private static void Task12() {
        System.out.println("\n* Task 12 *");
        TriFunction<Double, Double, Double, Double> weightedAverage = (grade, weight, totalWeight) -> grade * weight / totalWeight;

        double[] oceny = {3.0, 4.5, 5.0};
        double[] wagi = {1.0, 2.0, 3.0};

        double totalWeight = 0;
        for (double w : wagi) {
            totalWeight += w;
        }

        double weightedSum = 0;
        for (int i = 0; i < oceny.length; i++) {
            weightedSum += weightedAverage.apply(oceny[i], wagi[i], totalWeight);
        }

        System.out.println("Weighted average: " + weightedSum);
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    private static void Task11() {
        System.out.println("\n* Task 11 *");
        StringFormatter toUpper = String::toUpperCase;
        StringFormatter addPrefix = s -> ">>> " + s;
        StringFormatter reverse = s -> new StringBuilder(s).reverse().toString();

        String text = "Trial String";
        System.out.println("Text: " + text);
        System.out.println("To uppercase: " + applyFormat(text, toUpper));
        System.out.println("Add prefix: " + applyFormat(text, addPrefix));
        System.out.println("Reverse: " + applyFormat(text, reverse));
    }

    static String applyFormat(String text, StringFormatter formatter) {
        return formatter.format(text);
    }

    @FunctionalInterface
    interface StringFormatter {
        String format(String input);
    }

    private static void Task10() {
        System.out.println("\n* Task 10 *");
        Supplier<String> codeGenerator = () -> {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int index = random.nextInt(chars.length());
                code.append(chars.charAt(index));
            }
            return code.toString();
        };
        String[] codes = new String[10];
        for (int i = 0; i < codes.length; i++) {
            codes[i] = codeGenerator.get();
        }
        System.out.println("Generated codes: ");
        for (String code : codes) {
            System.out.println(code);
        }
    }

    private static void Task9() {
        System.out.println("\n* Task 9 *");
        Map<String, Integer> products = new HashMap<>();
        products.put("iPhone", 5);
        products.put("Laptop Dell", 7);
        products.put("Monitor 4k", 12);

        BiConsumer<String, Integer> reporter = (product, quantity) -> System.out.println("Product: " + product + ", Quantity: " + quantity);

        printReport(products, reporter);
    }

    private static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
        }
    }

    private static void Task8() {
        System.out.println("\n* Task 8 *");
        List<String> strings = Arrays.asList("First String", "Second String", "Third String", "Fourth String");

        Consumer<String> logger = System.out::println;

        printWithNumbers(strings, logger);
    }

    private static void printWithNumbers(List<String> strings, Consumer<String> consumer) {
        for (int i = 0; i < strings.size(); i++) {
            consumer.accept((i + 1) + ") " + strings.get(i));
        }
    }


    private static void Task7() {
        System.out.println("\n* Task 7 *");
        BiPredicate<String, String> sameIgnoreCase = String::equalsIgnoreCase;
        BiPredicate<String, String> isSuffix = String::endsWith;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Type second string: ");
        String s2 = scanner.nextLine();

        System.out.println("Strings are equal: " + sameIgnoreCase.test(s1, s2));
        System.out.println("First string ends with second string: " + isSuffix.test(s1, s2));
    }

    private static void Task6() {
        System.out.println("\n* Task 6 *");
        Predicate<String> validateLength = s -> s.length() >= 3;
        Predicate<String> alphanumeric = s -> s.matches("[a-zA-Z0-9]+");
        Predicate<String> startsWithLetter = s -> !s.isEmpty() && Character.isLetter(s.charAt(0));

        Predicate<String> isValidLogin = validateLength.and(alphanumeric).and(startsWithLetter);
        String[] loginy = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};

        System.out.println("Valid logins: ");
        int count = 0;
        for (String login : loginy) {
            if (isValidLogin.test(login)) {
                count++;
                System.out.println(login + ", ");
            }
        }
        System.out.println("Number of valid logins: " + count);
    }

    private static void Task5() {
        System.out.println("\n* Task 5 *");
        UnaryOperator<List<Integer>> removeNegatives = list -> {
            list.removeIf(n -> n < 0);
            return list;
        };
        BinaryOperator<Integer> maxOp = (a, b) -> a > b ? a : b;

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -1, 7, -5, 10, 0));
        System.out.println("List of numbers: " + nums);
        removeNegatives.apply(nums);
        System.out.println("After removing negatives: " + nums);
        int max = nums.getFirst();
        for (int i = 1; i < nums.size(); i++) {
            max = maxOp.apply(max, nums.get(i));
        }
        System.out.println("Maksimum: " + max);
    }

    private static void Task4() {
        System.out.println("\n* Task 4 *");
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first number: ");
        int a = scanner.nextInt();
        System.out.println("Type in the second number: ");
        int b = scanner.nextInt();
        System.out.println("Type in the operator (+, -, *, /): ");
        String operator = scanner.next();

        BiFunction<Integer, Integer, Integer> operation;
        switch (operator) {
            case "+":
                operation = add;
                break;
            case "-":
                operation = sub;
                break;
            case "*":
                operation = mul;
                break;
            case "/":
                operation = div;
                break;
            default:
                System.out.println("Nieznany operator!");
                return;
        }

        int result = calculate(a, b, operation);
        System.out.println("Result = " + result);
    }

    private static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }

    private static void Task3() {
        System.out.println("\n* Task 3 *");
        Function<String, Integer> countWithoutSpaces = s -> s.replaceAll(" ", "").length();
        Function<String, Integer> countVowels = s -> {
            String vowels = "aeiouy";
            int count = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = scanner.nextLine();
        System.out.println("Word count without spaces: " + countWithoutSpaces.apply(text));
        System.out.println("Number of vowels: " + countVowels.apply(text));
    }

    private static void Task2() {
        System.out.println("\n* Task 2 *");
        Function<String, String> trim = String::trim;
        Function<String, String> toLowerCase = String::toLowerCase;
        Function<String, String> removeSpaces = s -> s.replaceAll(" ", "");
        Function<String, String> normalizeLogin = trim.andThen(toLowerCase).andThen(removeSpaces);

        String[] loginy = {"  Adam  ", "ANIA K  ", "  k o w a l "};
        String[] loginyAfter = new String[loginy.length];

        for (int i = 0; i < loginy.length; i++) {
            loginyAfter[i] = normalizeLogin.apply(loginy[i]);
            System.out.println(loginyAfter[i]);
        }
    }

    private static void Task1() {
        System.out.println("\n* Task 1 *");
        Runnable r1 = () -> System.out.println("Startuję program...");
        Runnable r2 = () -> System.out.println("Kończę program.");
        r1.run();
        r2.run();
        new Thread(r2).start();
    }
}