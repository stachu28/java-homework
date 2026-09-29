package Task3;

import java.util.Scanner;

public class OccurrencesOfAGivenValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the length of an array: ");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Type another number to add to the array: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Type a number of which occurrences you want to count: ");
        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count = count + 1;
            }
        }
        System.out.println("Number " + x + " occured " + count + " times.");
        sc.close();
    }
}