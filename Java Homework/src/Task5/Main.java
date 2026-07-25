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
    }
}
