package Task2;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj string: ");
        String string = sc.nextLine();

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        sc.close();
    }
}
