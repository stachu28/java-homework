package Task4;

public class SumOfArrayElements {
    static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(sumaTablicy(array));
    }

    static int sumaTablicy(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
