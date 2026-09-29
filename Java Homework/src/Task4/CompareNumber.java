package Task4;

import java.util.Scanner;

public class CompareNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int a = scanner.nextInt();
        System.out.println("Type the second number: ");
        int b = scanner.nextInt();
        max(a, b);
    }

    static void max(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
