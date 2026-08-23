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

    public void reducePrice(Double amount) {
        if (amount > 0 && amount <= price) {
            price -= amount;
            System.out.printf("Price of %s was reduced by %.2f to total of: %.2f\n", name, amount, price);
        } else {
            System.out.println("Reduction unsuccessful! Check your parameters!");
        }
    }

    public void reducePrice(Double amount, String reason) {
        if (amount > 0 && amount <= price) {
            price -= amount;
            System.out.printf("Price of %s was reduced by %.2f to total of %.2f, due to: %s\n", name, amount, price,
                    reason);
        } else {
            System.out.println("Reduction unsuccessful! Check your parameters!");
        }
    }
}
