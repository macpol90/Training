package course1024.homework;

/**
 * Created by Maciej Polansky on 2018-12-07.
 **/

public class Cloth extends Product {
    private String size;
    private String material;

    public Cloth(long id, String productName, double price, double weight,
                 String color, Integer productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
