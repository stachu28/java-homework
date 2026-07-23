package Task4;

import java.util.Scanner;

public class isEven {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Twpisz liczbe zeby sprawdzic czy jest parzysta: ");
        int liczba = scanner.nextInt();
        boolean result = czyParzysta(liczba);

        if (result) {
            System.out.println("Jest parzysta");
        } else {
            System.out.println("Nie jest parzysta");
        }
    }

    static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }
}
