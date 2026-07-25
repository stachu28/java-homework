package Task5;

public class Car {
    String brand;
    int yearOfProduction;

    public Car(String brand, int yearOfProduction) {
    }

    @Override
    public String toString() {
        return brand + " " + yearOfProduction;
    }
}
