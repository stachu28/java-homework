package Task1;

import java.util.Scanner;

public class DayOfTheWeek {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wczytaj numer dnia tygodnia (1-7): ");
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Poniedziałek");
            break;
            case 2:
                System.out.println("Wtorek");
            break;
            case 3:
                System.out.println("Środa");
            break;
            case 4:
                System.out.println("Czwartek");
            break;
            case 5:
                System.out.println("Piątek");
            break;
            case 6:
                System.out.println("Sobota");
            break;
            case 7:
                System.out.println("Niedziela");
            break;
            default:
                System.out.println("Nieznany dzień");
        }
        scanner.close();
    }
}
