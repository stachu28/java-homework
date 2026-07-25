package Task5;

public class Main {
    static void main(String[] args) {
        Car car1 = new Car("Audi", 2024);
        System.out.println(car1.toString());

        Car car2 = new Car();
        System.out.println(car2);

        Car car3 = new Car("BMW", 2023);
        Car car4 = new Car("VW", 2021);
        Car car5 = new Car("Porsche", 2019);

    }
}
