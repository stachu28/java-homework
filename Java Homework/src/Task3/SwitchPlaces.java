package Task3;

import java.util.Scanner;

public class SwitchPlaces {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type array lenght: ");
        int arrayLenght = sc.nextInt();

        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("Add a number to the array");
            array[i] = sc.nextInt();
        }

        if (arrayLenght > 1) {
            int firstNumber = array[0];
            array[0] = array[arrayLenght - 1];
            array[arrayLenght - 1] = firstNumber;
        }

        System.out.println("Array with switched numbers: ");
        for (int i = 0; i < arrayLenght; i++) {
            System.out.println(array[i] + " ");
        }
        sc.close();
    }
}
