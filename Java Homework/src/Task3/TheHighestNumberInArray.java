package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class TheHighestNumberInArray {
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
        int highestNumber = array[array.length - 1];
        System.out.println("The highest number is: " + highestNumber);
    }
}
