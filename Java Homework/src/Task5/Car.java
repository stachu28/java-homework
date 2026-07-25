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
        brand = "Unknown";
        yearOfProduction = 2000;
    }

    public void showDifference() {
        String localBrand = "brand";
        System.out.println("local brand: " + localBrand);
        System.out.println("this brand: " + this.brand);}

}
