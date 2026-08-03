package Task3;

public class DiagonalOfMatrix {
    static void main(String[] args) {
        int[][] array = new int[10][10];
        int number = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][i]);
        }
    }
}
