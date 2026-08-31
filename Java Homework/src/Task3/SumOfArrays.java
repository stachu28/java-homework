package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the lenght of arrays: ");
        int lenght = sc.nextInt();

        int[] arrayOne = new int[lenght];
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("Add number to the 1st array: ");
            arrayOne[i] = sc.nextInt();
        }

        int[] arrayTwo = new int[lenght];
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("Add number two 2nd array: ");
            arrayTwo[i] = sc.nextInt();
        }

        int[] arrayCombined = new int[lenght];
        for (int i = 0; i < arrayCombined.length; i++) {
            arrayCombined[i] = arrayOne[i] + arrayTwo[i];
        }

        System.out.println("Combined array is: " + Arrays.toString(arrayCombined));
    }
}
