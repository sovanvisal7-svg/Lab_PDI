import java.util.ArrayList;

class Product {
    protected String name;
    protected double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getInfo() {
        return name + " - $" + price;
    }
}

class Electronics extends Product {
    private int warranty;  

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    String getInfo() {
        return "Electronics: " + name + " - $" + price + " (Warranty: " + warranty + " months)";
    }
}

class Clothing extends Product {
    private String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    String getInfo() {
        return "Clothing: " + name + " - $" + price + " (Size: " + size + ")";
    }
}

class Book extends Product {
    private String author;

    Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    String getInfo() {
        return "Book: " + name + " - $" + price + " (Author: " + author + ")";
    }
}

public class Ex8_ProductCatalog {
    public static void main(String[] args) {
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add(new Electronics("Laptop", 750.0, 24));
        catalog.add(new Clothing("T-Shirt", 12.5, "M"));
        catalog.add(new Book("Clean Code", 30.0, "Robert C. Martin"));

        for (Product p : catalog) {
            System.out.println(p.getInfo());
        }
    }
}
