package course1024.homework;

/**
 * Created by Maciej Polansky on 2018-12-07.
 **/

public class Product {
    private long id;
    private String productName;
    private double price;
    private double weight;
    private String color;
    private Integer productCount;

    public Product(long id, String productName, double price, double weight, String color, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }

    public Integer getProductCount(){
        return productCount;
    }

    public void setProductCount(Integer productCount){
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
