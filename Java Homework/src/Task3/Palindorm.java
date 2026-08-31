package Task3;

import java.util.Scanner;

public class Palindorm {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz zdanie aby zweryfikowac czy jest palindormem: ");
        String text = scanner.nextLine();

        text.replace(" ", "").toLowerCase();

        boolean isPalidrome = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalidrome = false;
                break;
            }
        }

        if (isPalidrome) {
            System.out.println("Tekst jest palidromem!");
        } else if (!isPalidrome) {
            System.out.println("Tekst nie jest palidromem!");
        }
    }
}