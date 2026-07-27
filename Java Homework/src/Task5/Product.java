package Task5;

public class Product {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.printf("Product: %s, costs: %.2f\n", name, price);
    }
}
