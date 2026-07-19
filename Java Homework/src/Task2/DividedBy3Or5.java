package Task2;

import java.util.Scanner;

public class DividedBy3Or5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj początek zakresu: ");
        int start = sc.nextInt();

        System.out.println("Podaj koniec zakresu: ");
        int finish = sc.nextInt();

        System.out.println("Liczby podzielne przez 3 i 5 w przedziale: ");

        for (int i = start; i < finish; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
