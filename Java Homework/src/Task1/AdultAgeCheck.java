package Task1;

import java.util.Scanner;

public class AdultAgeCheck {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj wiek: ");
            int age = scanner.nextInt();
            String adultAge = age >= 18 ? "Jesteś pełnoletni" : "Jesteś niepełnoletni";
            scanner.close();
            System.out.println(adultAge);
        }
    }
