package Task5;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduceYourself() {
        System.out.printf("Hi! I'm %s(%d)!\n", name, age);
    }
}

