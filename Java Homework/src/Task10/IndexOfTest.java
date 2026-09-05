package Task10;

public class IndexOfTest {
    static void main(String[] args) {
        System.out.println("\n* Null with duplicates *");
        String[] s = {null, "a", null, "b", "a"};
        System.out.println(ArrayUtils.indexOf(s, null));
        System.out.println(ArrayUtils.lastIndexOf(s, null));
        System.out.println(ArrayUtils.indexOf(s, "a"));
        System.out.println(ArrayUtils.lastIndexOf(s, "a"));

        System.out.println("\n* No Element *");
        String[] s2 = {"x", "y"};
        System.out.println(ArrayUtils.indexOf(s2, "zzz"));
    }
}