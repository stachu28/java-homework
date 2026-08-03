package Task4;

import java.util.Arrays;

public class HighestNumberOfArray {
    static void main(String[] args) {
        int[] array = {3, 24, 2, 5, 6, 9};

        System.out.println(maxTablicy(array));

    }

    static int maxTablicy(int[] tab) {
        Arrays.sort(tab);
        int max = tab[tab.length - 1];
        return max;
    }
}
