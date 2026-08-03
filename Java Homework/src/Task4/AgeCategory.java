package Task4;

import java.util.Scanner;

public class AgeCategory {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your age: ");
        int wiek = scanner.nextInt();

        ageCategory(wiek);
    }

    private static void ageCategory(int wiek) {
        if (wiek < 12) {
            System.out.println("Child");
        } if (wiek >= 12 && wiek <= 17) {
            System.out.println("Teenager");
        } if (wiek >= 18 && wiek <= 64) {
            System.out.println("Adult");
        } if (wiek >= 65) {
            System.out.println("Senior");
        }
    }
}