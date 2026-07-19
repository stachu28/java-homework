package Task2;

import java.util.Scanner;

public class DoWhileOneTry {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        do {
            System.out.println("Podaj dodatnią liczbę: ");
            number = sc.nextInt();
        } while (number < 0);
        System.out.println("Podano dodatnią liczbę: " + number);
    }
}
