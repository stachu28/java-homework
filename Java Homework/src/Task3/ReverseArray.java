package Task3;

import java.util.Scanner;

public class ReverseArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type array lenght: ");
        int arrayLenght = sc.nextInt();

        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("Add a number to the array");
            array[i] = sc.nextInt();
        }

        System.out.println("Reversed Array: ");
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(array[i] + " ");
        }
        sc.close();
        }
    }
