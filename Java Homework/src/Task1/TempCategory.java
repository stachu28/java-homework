package Task1;

import java.util.Scanner;

public class TempCategory {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wczytaj temperature w stopniach Celciusza: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("Mróz");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("Chłodno");
        } else if (temperature >= 16 && temperature <= 25) {
            System.out.println("Ciepło");
        } else if (temperature > 25) {
            System.out.println("Gorąco");
        }
        scanner.close();
    }
}