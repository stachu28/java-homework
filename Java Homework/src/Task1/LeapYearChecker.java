package Task1;

import java.util.Scanner;

public class LeapYearChecker {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();

        if (year % 4 != 0) {
            System.out.println("Rok nie jest przestępny.");
        } else if (year % 100 != 0) {
            System.out.println("Rok jest przestępny.");
        } else if (year % 400 != 0) {
            System.out.println("Rok jest przestępny.");
        } else {
            System.out.println("Rok nie jest przestępny.");
        }
        scanner.close();
    }
}
