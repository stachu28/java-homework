package Task3;

public class SumArrayElements {
    static void main(String[] args) {
        int[] array = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
