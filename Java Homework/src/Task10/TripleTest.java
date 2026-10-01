package Task10;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class TripleTest {
    static void main(String[] args) {
        System.out.println("\n* Equality *");
        Triple<String, Integer, Boolean> t1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t3 = Triple.of("id", 43, true);
        System.out.println("t1.equals(t2)" + t1.equals(t2));
        System.out.println("t1.equals(t3)" + t1.equals(t3));

        System.out.println("\n* Accessory *");
        Triple<String, Integer, Boolean> t = Triple.of("id", 42, true);
        System.out.println("t.first()` → `id`" + t.first());
        System.out.println("t.second()` → `id`" + t.second());
        System.out.println("t.third()` → `id`" + t.third());

        System.out.println("\n* toString *");
        Triple<String, String, String> tt = Triple.of("A", "B", "C");
        System.out.println(tt.toString());
    }
}