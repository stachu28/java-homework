package Task5;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 0);
    }

    public Person() {
        this("Unknown");
    }

    public void introduceYourself() {
        System.out.printf("My name is %s, and I am %d!\n", name, age);
    }

    public void introduceYourself(String greetings) {
        System.out.printf("%s! My name is %s, and I am %d!\n", greetings, name, age);
    }
}

