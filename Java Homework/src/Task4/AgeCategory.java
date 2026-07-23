package Task4;

import java.util.Scanner;

public class AgeCategory {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();

        kategoriaWiekowa(wiek);
    }

    private static void kategoriaWiekowa(int wiek) {
        if (wiek < 12) {
            System.out.println("Dziecko");
        } if (wiek >= 12 && wiek <= 17) {
            System.out.println("Nastolatek");
        } if (wiek >= 18 && wiek <= 64) {
            System.out.println("Dorosły");
        } if (wiek >= 65) {
            System.out.println("Senior");
        }
    }
}
//6. **Kategoria wiekowa**
//        - Napisz metodę `kategoriaWiekowa(int wiek)`, która zwraca napis:
//        `Dziecko` (< 12), `Nastolatek` (12–17), `Dorosły` (18–64), `Senior` (>= 65).
//        - Wywołaj metodę w `main` po wczytaniu wieku od użytkownika.