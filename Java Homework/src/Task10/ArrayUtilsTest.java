package Task10;

import java.util.Arrays;

public class ArrayUtilsTest {
    static void main(String[] args) {
        System.out.println("\n* Element Swap *");
        String[] a = {"A", "B", "C"};
        System.out.println(Arrays.toString(a));
        ArrayUtils.swap(a, 0, 2);
        System.out.println(Arrays.toString(a));

        System.out.println("\n* Index Validation *");
        Integer[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));
        try {
            ArrayUtils.swap(nums, -1, 0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            ArrayUtils.swap(nums, 0, 3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            dlaczego Index 3 out of bounds for length 3 a nie IndexOutOfBoundsException?
        }

        System.out.println("\n* No Operation *");
        String[] x = {"X", "Y"};
        System.out.println(Arrays.toString(x));
        ArrayUtils.swap(x, 1, 1);
        System.out.println(Arrays.toString(x));
    }
}