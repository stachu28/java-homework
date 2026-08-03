package Task2;

import java.util.Scanner;

public class AvgGrade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę ocen: ");
        int gradeCount = sc.nextInt();
        int gradeSum = 0;

        for (int i = 0; i < gradeCount; i++) {
            System.out.println("Podaj ocenę(" + i + "/" + gradeCount + "): ");
            int grade = sc.nextInt();
            gradeSum = gradeSum + grade;
        }
        double averageGrade = gradeSum / gradeCount;

        System.out.println("Średnia ocen wynosi: " + averageGrade);

        sc.close();
    }
}
