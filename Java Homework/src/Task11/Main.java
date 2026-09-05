package Task11;

public class Main {
    static void main(String[] args) {
        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();
        System.out.println("* TwoKeyMap Tests *");
        grades.put("Alice", "Chemistry", 5);
        grades.put("Alice", "Math", 4);
        grades.put("Rob", "Chemistry", 3);
        System.out.println("get Alice chemistry grade: " + grades.get("Alice", "Chemistry"));
        System.out.println("get Alice math grade: " + grades.get("Alice", "Math"));
        System.out.println("get Rob chemistry grade: " + grades.get("Rob", "Chemistry"));
        System.out.println("get Rob math grade: " + grades.get("Rob", "Math"));
        System.out.println("map size: " + grades.size());
        System.out.println("remove Alice math grade of value " + grades.remove("Alice", "Math"));
        System.out.println("get Alice math grade: " + grades.get("Alice", "Math"));
        System.out.println("map size: " + grades.size());
        System.out.println("adding Alice math grade back to the map");
        grades.put("Alice", "Math", 4);
        System.out.println("get Alice math grade: " + grades.get("Alice", "Math"));
        System.out.println("map size: " + grades.size());
        System.out.println("map contain Alice math grade: " + grades.containsKeys("Alice", "Math"));
        System.out.println("map contain Alice chemistry grade: " + grades.containsKeys("Alice", "Chemistry"));
        System.out.println("map contain Alice english grade: " + grades.containsKeys("Alice", "English"));
        System.out.println("map contain grade 5: " + grades.containsValue(5));
        System.out.println("map contain grade 2: " + grades.containsValue(2));
        System.out.println("map keySet: " + grades.keySet());
        System.out.println("values: " + grades.values());
        System.out.println("entrySet: " + grades.entrySet());
        System.out.println("iterating through the map with forEach: ");
        for (TwoKeyMap.Entry<String, String, Integer> e : grades) {
            System.out.println(e.getKey1() + ", " + e.getKey2() + " = " + e.getValue());
        }
        System.out.println("clearing map");
        grades.clear();
        System.out.println("map is empty: " + grades.isEmpty());
    }
}