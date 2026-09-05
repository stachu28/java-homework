package Task3;

import java.util.Arrays;

public class SumOf3x3 {
    static void main(String[] args) {
        int[][] array = {{3, 4, 6}, {4, 6, 3}, {2, 8, 9}};
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
