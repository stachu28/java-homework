package Task1;

import java.util.Scanner;

public class DateVerifier {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzień: ");
        int day = scanner.nextInt();
        System.out.println("Podaj miesiąc: ");
        int month = scanner.nextInt();
        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();

        boolean dateIsCorrect = isDateCorrect(day, month, year);

        if (dateIsCorrect) {
            System.out.println("Data poprawna!");
        } else {
            System.out.println("Data niepoprawna!");
        }
        scanner.close();
    }

    private static boolean isDateCorrect(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int daysOfTheMonth = daysOfTheMonth(month, year);
        if (day < 1 || day > daysOfTheMonth) {
            return false;
        }
        return true;
    }

    private static int daysOfTheMonth(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                return isYearLeap(year) ? 29:28;
            }
        }
        return month;
    }

    private static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
