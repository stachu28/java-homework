package Task3;

import java.util.Arrays;

public class FindElement {
    static void main(String[] args) {
        int[][] array = {{1, 3, 6}, {47, 5, 6}, {7, 15, 21}};

        int[] combined = new int[9];
        int combinedIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                combined[combinedIndex] = array[i][j];
                combinedIndex++;
            }
        }
        Arrays.sort(combined);
        System.out.println("The highest number is: " + combined[combined.length - 1] + ", while third largest is: "
                + combined[combined.length - 3]);
    }
}
