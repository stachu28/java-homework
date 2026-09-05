package Task10;

public class PairTest {
    static void main(String[] args) {
        System.out.println("\n* Równość i hashcode* ");
        Pair<Integer, String> pair1 = Pair.of(1, "a");
        Pair<Integer, String> pair2 = Pair.of(1, "a");
        Pair<Integer, String> pair3 = Pair.of(1, "b");

        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        System.out.println(pair3.toString());
        System.out.println(pair1.equals(pair2));
        System.out.println(pair1.equals(pair3));
        System.out.println(pair1.hashCode() == pair2.hashCode());
        System.out.println(pair1.hashCode() == pair3.hashCode());

        System.out.println("\n* Obsługa null *");
        Pair<Integer, String> p1 = Pair.of(null, "x");

        System.out.println(p1.toString());
        System.out.println(p1.first());

        System.out.println("\n* Niemutowalność *");
        Pair<String, String> stringPair = Pair.of("A", "B");
        System.out.println(stringPair.first());
        System.out.println(stringPair.second());
    }
}