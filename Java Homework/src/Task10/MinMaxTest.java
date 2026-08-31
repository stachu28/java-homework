package Task10;

import java.util.Arrays;

public class MinMaxTest {
    static void main(String[] args) {
        System.out.println("\n* Line of Chars *");
        String[] s = {"aa", "b", "ccc"};
        System.out.println("array of: " + Arrays.toString(s));
        System.out.println(MinMax.minMax(s));

        System.out.println("\n* Numbers *");
        Integer[] a = {5, 5, -1, 10, 10};
        System.out.println("array of: " + Arrays.toString(a));
        System.out.println(MinMax.minMax(a));

        System.out.println("\n* One Element *");
        Integer[] x = {42};
        System.out.println("array of: " + Arrays.toString(x));
        System.out.println(MinMax.minMax(x));

        System.out.println("\n* Null Element *");
        Integer[] arr = {1, null, 2};
        System.out.println(Arrays.toString(arr));
        try {
            System.out.println(MinMax.minMax(arr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}