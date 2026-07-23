package Task3;

import java.util.Scanner;

public class TypeIn3x3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][3];
        int number = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = number;
                number++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
