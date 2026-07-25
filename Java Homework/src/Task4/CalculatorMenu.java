package Task4;

import java.util.Scanner;

public class CalculatorMenu {
    static void main(String[] args) {
        int chooseAction;

        do {
            menu();
            chooseAction = scanner.nextInt();
            switch (chooseAction) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Incorrect choice!");
            }
        } while (chooseAction != 0);
        scanner.close();
    }

    private static void multiply() {
        System.out.println("Type in the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Type in the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Result = " + (a * b));
    }3

    private static void subtract() {
        System.out.println("Type in the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Type in the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Result = " + (a - b));
    }

    private static void add() {
        System.out.println("Type in the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Type in the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Result = " + (a + b));
    }

    private static void menu() {
        System.out.println("*** CALCULATOR ***");
        System.out.println("Press 1 to add");
        System.out.println("Press 2 to subtract");
        System.out.println("Press 3 to multiply");
        System.out.println("Press 0 to EXIT");
    }

    static Scanner scanner = new Scanner(System.in);
}
