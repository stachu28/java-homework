package Task2;

import java.util.Scanner;

public class FirstLineDividedBy7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę 'n': ");
        int n = sc.nextInt();

        for (int i = n + 1; ; i++) {
            if (i % 7 == 0){
                System.out.println("Liczba większa od `n`, która jest podzielna przez 7 to: " + i);
                break;
            }
        }
        sc.close();
    }
}
