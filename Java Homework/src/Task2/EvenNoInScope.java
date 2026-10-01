package Task2;

import java.util.Scanner;

public class EvenNoInScope {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe 'n': ");
        int n = sc.nextInt();

        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
