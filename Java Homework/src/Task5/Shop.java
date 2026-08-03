package Task5;

public class Shop {
    String name;
    Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) +". ");
            products[i].showProduct();
        }
    }
}
