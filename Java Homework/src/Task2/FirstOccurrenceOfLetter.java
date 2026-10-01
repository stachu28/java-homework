package Task2;

import java.util.Scanner;

public class FirstOccurrenceOfLetter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj napis: ");
        String string = sc.nextLine();

        int place = -1;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                place = i;
                break;
            }
        }

        if (place != -1) {
            System.out.println("Litera znajduje się na pozycji: " + place);
        } else {
            System.out.println("Nie znaleziono takiej litery!");
        }
        sc.close();
    }
}
