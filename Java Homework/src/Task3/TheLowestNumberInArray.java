package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class TheLowestNumberInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the lenght of an array: ");
        int arrayLenght = sc.nextInt();

        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("Type a number to add it into array: ");
            int number = sc.nextInt();
            array[i] = number;
        }
        Arrays.sort(array);
        int lowestNumber = array[0];
        System.out.println("The lowest number is: " + lowestNumber);
    }
}
