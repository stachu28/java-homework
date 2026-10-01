package Task3;

public class SumOfColumns2x3 {
    static void main(String[] args) {
        int[][] array = {{3, 2, 5}, {3, 7, 0}};

        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " equals " + sum);
        }
    }
}