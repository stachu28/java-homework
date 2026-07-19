package Task2;

import java.util.Scanner;

public class WhileCountdown {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt();

        while (n >= 0) {
            System.out.println(n);
            n--;
        }
        scanner.close();
    }
}
