package Task2;

import java.util.Scanner;

public class LogInCounter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login = "log";
        String password = "pass";
        int maxTries = 3;
        boolean logged = false;

        for (int tries = 0; tries <= maxTries ; tries++) {
            System.out.print("Podaj login: ");
            String usrLgn = sc.nextLine();
            System.out.print("Podaj hasło: ");
            String usrPsw = sc.nextLine();

            if (usrLgn.equals(login) && usrPsw.equals(password)) {
                System.out.println("Zalogowno!");
                logged = true;
                break;
            } else {
                System.out.println("Błędne hasło");
            }
        } if (!logged) {
            System.out.println("Konto zablokowane!");
        }
        sc.close();
    }
}
