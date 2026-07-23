package Task4;

import java.util.Arrays;

public class MergeArray {
    static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(merge(array1, array2)));
    }
    static int[] merge(int[] tab1, int[] tab2) {
        int[] combinedArray = new int[tab1.length + tab2.length];

        for (int i = 0; i < tab1.length; i++) {
            combinedArray[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            combinedArray[tab1.length + i] = tab2[i];
        }
        return combinedArray;
    }
}
