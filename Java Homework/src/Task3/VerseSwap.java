package Task3;

import java.util.Arrays;

public class VerseSwap {
    static void main(String[] args) {
        int[][] array = new int[5][5];
        int number = 10;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number++;
            }
        }
        int[] temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int temp2 = array[i][i];
            array[i][i] = array[i][array.length - 1 - i];
            array[i][array.length - 1 - i] = temp2;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
