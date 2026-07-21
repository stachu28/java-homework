package Task3;

import java.util.Scanner;

public class SearchingForElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the lenght of an array: ");
        int lenght = sc.nextInt();

        int[] array = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Type a number to add it to the array: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Type a number to check if it is in the array");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < lenght; i++) {
            if (array[i] == x) {
                found = true;
                break;
            }
            if (array[i] != x) {
                found = false;
            }
        }
        if (found == true) {
            System.out.println("Found");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
