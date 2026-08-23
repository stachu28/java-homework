package Task9;

import java.util.Scanner;

public class Main {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().controlLoop();
    }

    private void controlLoop() {
        boolean running = true;

        while (running) {
            printOptions();

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                default -> System.out.println("Wrong option.");
            }
        }
        sc.close();
    }

    private void task1() {
        System.out.println("--- Task 1 - Password Validator ---");
        System.out.print("Type password: ");
        String password = sc.nextLine();

        try {
            PasswordValidator.validate(password);
            System.out.println("OK");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void task2() {
        System.out.println("--- Task 2 - Positive Number Parser ---");
        System.out.print("Type a positive number: ");
        String input = sc.nextLine();

        try {
            int number = NumberParser.parsePositiveInt(input);
            System.out.println("Correct number: " + number);
        } catch (InvalidNumberException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void task3() {
        System.out.println("--- Task 3 - Bank Account ---");

        System.out.print("Type account balance: ");
        int balance = sc.nextInt();

        System.out.print("Type amount to withdraw: ");
        int amount = sc.nextInt();
        sc.nextLine();

        BankAccount account = new BankAccount(balance);

        try {
            account.withdraw(amount);
            System.out.println("Withdrawal successful!");
            System.out.println("Current balance: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("End of transaction.");
        }
    }

    private void task4() {
        System.out.println("--- Task 4 - Multi-catch ---");
        System.out.print("Type command (ARG, STATE): ");
        String cmd = sc.nextLine();

        CommandProcessor.demo(cmd);
    }

    private void task5() {
        System.out.println("--- Task 5 - Email Validator ---");
        System.out.print("Type email: ");
        String email = sc.nextLine();

        try {
            EmailValidator.validate(email);
            System.out.println("Email is correct.");
        } catch (EmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void printOptions() {
        System.out.println("""
                Choose task:
                1 - Password Validator
                2 - Positive Number Parser
                3 - Bank Account
                4 - Multi-catch
                5 - Email Validator
                0 - Exit
                """);
        System.out.print("Choice: ");
    }
}