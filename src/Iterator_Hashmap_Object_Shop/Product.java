package Iterator_Hashmap_Object_Shop;

import java.util.Objects;

public class Product {
    private String title;
    private double price;
    private double discount;
    private String description;

    public Product(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Product {" +
                "title: '" + title + '\'' +
                ", price: " + getPriceWithDiscount() +
                '}';
    }

    public double getPriceWithDiscount(){
        return price - (price * (getDiscount()/100));
    }
}
