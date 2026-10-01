package Task2;

import java.util.Scanner;

public class SumOfNoRange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe 'n': ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        System.out.println("Suma liczb od 1 do " + n + " wynosi: " + sum);
        sc.close();
    }
}
