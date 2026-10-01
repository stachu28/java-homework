package Task3;

public class SumOfLines2x3 {
    static void main(String[] args) {
        int[][] array = {{3, 2, 5}, {3, 7, 0}};

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Sum of line " + (i + 1) + " equals " + sum);
        }
    }
}
