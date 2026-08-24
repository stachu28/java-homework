package Task4;

import java.util.Scanner;

public class isEven {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number to check if it is even: ");
        int liczba = scanner.nextInt();
        boolean result = isEven(liczba);

        if (result) {
            System.out.println("It is even");
        } else {
            System.out.println("It is not even");
        }
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
