package Task3;

import java.util.Arrays;

public class AverageOfArrayElements {
    static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("Average of numbers: " + Arrays.toString(array) + " is: " + average);
    }

}
