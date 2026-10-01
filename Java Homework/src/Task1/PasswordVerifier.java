package Task1;

import java.util.Scanner;

public class PasswordVerifier {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        if (Character.isLowerCase(password.charAt(0))) {
            System.out.println("Hasło musi zaczynać się dużą literą!");
        } else if (password.length() < 8 ) {
            System.out.println("Hasło za krótkie!");
        } else
            System.out.println("OK");

        scanner.close();
    }
}
