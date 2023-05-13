package theory.tarasov.builder;

public class Product {
    private String name;
    private long price;
    private String description;

    private String manufacturer;
    private int quantity;

    public Product() {
    }

    public Product(String name, long price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public Product(String name, long price, String description, int quantity, String manufacturer) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
