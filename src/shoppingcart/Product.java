package shoppingcart;

import java.util.Objects;

public class Product {
    private int key;
    private String name;
    private double price;

    public Product(int key) {
        this.key = key;
    }

    public Product(int key, String name, double price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return key == product.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
