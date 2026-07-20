package Task2;

import java.util.Scanner;

public class MultiplierLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe 'x': ");
        int x = sc.nextInt();

        System.out.println("Podaj jej potęgę: ");
        int y = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= y; i++) {
            result *= x;
        }

        System.out.println(x + " do potęgi " + y + " = " + result);
    }
}
