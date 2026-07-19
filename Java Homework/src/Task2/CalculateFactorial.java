package Task2;

import java.util.Scanner;

public class CalculateFactorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Silnia z " + n + " to: " + factorial);
    }
}
