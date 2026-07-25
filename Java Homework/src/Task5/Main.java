package Task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** 1 ***");
        Car car1 = new Car("Audi", 2024);
        System.out.println(car1.toString());

        System.out.println("\n *** 2 ***");
        Car car2 = new Car();
        System.out.println(car2);

        System.out.println("\n *** 3 ***");
        Car car3 = new Car("BMW", 2023);
        Car car4 = new Car("VW", 2021);
        Car car5 = new Car("Porsche", 2019);

        System.out.println("\n *** 4 ***");
        car3.showDifference();
        car4.showDifference();

        System.out.println("\n *** 5 ***");
        System.out.println(car5.brand);
        car5.changeBrand("Audi");
        System.out.println(car5.brand);

        System.out.println("\n *** 6 ***");
        Car car6 = new Car();
        System.out.println(car6);

        System.out.println("\n *** 7 ***");
        car4.introduceYourself();
        car6.introduceYourself();

        System.out.println("\n *** 8 ***");
        Car.classDescription();

        System.out.println("\n *** 9 ***");
        System.out.println(Car.getCount());

        System.out.println("\n *** 10 ***");
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", 2023);
        cars[1] = new Car("Kia", 2013);
        cars[2] = new Car("Hyundai", 2020);

        System.out.println("Cars in an array: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].brand + " " + cars[i].yearOfProduction);

        }

        System.out.println("\n *** 11 ***");
        Person person1 = new Person ("John", 24);
        Person person2 = new Person ("Peter", 22);
        Person person3 = new Person ("Mark", 43);

        person1.introduceYourself();
        person2.introduceYourself();
        person3.introduceYourself();

        System.out.println("\n *** 12 ***");
        person1.introduceYourself("Hello");
        person2.introduceYourself("Greetings");
        person3.introduceYourself("Nice to meet you");

        System.out.println("\n *** 13 ***");
        Person person4 = new Person ("Kate");
        Person person5 = new Person ("Pete");
        Person person6 = new Person ("Kris");

        person4.introduceYourself();
        person5.introduceYourself("Hello");
        person6.introduceYourself("Welcome");

    }
}
