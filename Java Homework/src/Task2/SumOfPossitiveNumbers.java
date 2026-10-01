package Task2;

import java.util.Scanner;

public class SumOfPossitiveNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Podaj liczbę (aby zakończyć podaj 0): ");
            int number = sc.nextInt();
            if (number == 0){
                break;
            } if (number > 0);
            sum += number;
        }
        System.out.println("Suma liczb to: " + sum);
    }
}
