package Task1;

import java.util.Scanner;

public class EvenNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();;

        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }
        scanner.close();
    }
}
