package Task4;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(reverseArray(array));
    }

    static String reverseArray(int[] tab) {
        int[] reversedArray = new int[tab.length];
        for (int i = tab.length - 1; i >= 0; i--) {
            reversedArray[i] = tab[tab.length - 1 - i];
        }
        return Arrays.toString(reversedArray);
    }
}