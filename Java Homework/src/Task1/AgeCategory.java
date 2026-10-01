package Task1;

import java.util.Scanner;

public class AgeCategory {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek aby uzyskać jego kategorie: ");
        int wiek = scanner.nextInt();

        if (wiek < 12) {
            System.out.println("Dziecko");
        } else if (wiek >= 12 && wiek <= 17) {
            System.out.println("Nastolatek");
        } else if (wiek >= 18 && wiek <= 64) {
            System.out.println("Dorosły");
        } else if (wiek >= 65) {
            System.out.println("Senior");
        }
        scanner.close();
    }
}
