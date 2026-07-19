package Task1;

import java.util.Scanner;

public class MiniCalculator {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Podaj pierwszą cyfrę: ");
        double A = scanner.nextDouble();
        System.out.println("Podaj  operator (+, -, *, /, %): ");
        String operator = scanner.next();
        System.out.println("Podaj drugą cyfrę: ");
        double B = scanner.nextDouble();

        switch (operator) {
            case "+" -> result = A + B;
            case "-" -> result = A - B;
            case "*" -> result = A * B;
            case "/" -> result = A / B;
            case "%" -> result = A % B;
        }
        System.out.println(result);
        scanner.close();
    }
}
