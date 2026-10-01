package Task10;

import java.util.Arrays;

public class ArraysEqualTest {
    static void main(String[] args) {
        System.out.println("\n* Equal arrays with null *");
        Integer[] a = {1, null, 3};
        Integer[] b = {1, null, 3};
        System.out.println("array 'a': " + Arrays.toString(a));
        System.out.println("array 'b': " + Arrays.toString(b));
        System.out.println(ArrayUtils.arraysEqual(a, b));

        System.out.println("\n* Different arrays *");
        Integer[] c = {1, 2, 3};
        System.out.println("array 'c': " + Arrays.toString(c));
        System.out.println(ArrayUtils.arraysEqual(a, c));

        System.out.println("\n* Managing Entry null *");
        String[] a2 = {"x"};
        String[] b2 = {null};
        System.out.println("array a2: " + Arrays.toString(a2));
        System.out.println("array b2: " + Arrays.toString(b2));
        System.out.println("arrays equal: " + ArrayUtils.arraysEqual(a2, b2));
        System.out.println("null arrays equal: " + ArrayUtils.arraysEqual(null, null));
    }
}