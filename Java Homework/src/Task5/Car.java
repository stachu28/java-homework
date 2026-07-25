package Task5;

public class Car {
    String brand;
    int yearOfProduction;

    public Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return brand + " " + yearOfProduction;
    }

    public Car() {
        this("Unknown", 2000);
    }

    public void showDifference() {
        String localBrand = "brand";
        System.out.println("local brand: " + localBrand);
        System.out.println("this brand: " + this.brand);
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public void introduceYourself() {
        System.out.printf("I am a car of brand %s from year %d.", this.brand, this.yearOfProduction);
    }
}
