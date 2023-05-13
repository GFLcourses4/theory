package theory.tarasov.builder;

public class ProductBuilderImpl implements ProductBuilder {

    private String name;
    private long price;
    private String description;
    private int quantity;

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Product getProduct() {
        return new Product(name, price, description, quantity);
    }
}
