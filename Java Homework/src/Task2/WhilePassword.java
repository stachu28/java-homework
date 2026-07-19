package Task2;

import java.util.Scanner;

public class WhilePassword {
    static void main(String[] args) {
        String password = "java123";
        Scanner scanner = new Scanner(System.in);
        String userPW = null;

        do {
            System.out.println("Podaj hasło: ");
            userPW = scanner.nextLine();
            if (!userPW.equals(password)) {
                System.out.println("Spróbuj ponownie.");
            }
        } while (!userPW.equals(password));
        System.out.println("Hasło poprawne!");
        scanner.close();
    }
}
