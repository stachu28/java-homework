package Task1;

import java.util.Scanner;

public class VatCalculator {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wczytaj kategorię produktu jako tekst (`żywność`, `książki`, `usługi`, `ubrania`, `elektronika`, inne).");
        String category = scanner.nextLine();

        switch (category) {
            case "żywność", "książki" -> System.out.println("5%");
            case "usługi" -> System.out.println("8%");
            case "ubrania", "elektronika", "inne" -> System.out.println("23%");
         }
         scanner.close();
    }
}
