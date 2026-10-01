package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfValuesRangeTo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type number 'n': ");
        int n = sc.nextInt();

        int[] arrayOfNNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Type another number (" + i + "/" + n + "): ");
            int number = sc.nextInt();
            arrayOfNNumbers[i] = number;
        }
        System.out.println(Arrays.toString(arrayOfNNumbers));
        sc.close();
    }
}
