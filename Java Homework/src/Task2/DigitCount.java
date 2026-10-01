package Task2;

import java.util.Scanner;

public class DigitCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = sc.nextInt();

        int number = n;
        int digitNumber = 0;

        while (number > 0) {
            number /= 10;
            digitNumber++;
        }
        System.out.println("Liczba " + n + " ma " + digitNumber + " cyfr");
    }
}
