package theory.tarasov.builder;

public interface Builder {
    void setDescription(String description);
    void setName(String name);
    void setPrice(long price);
    void setQuantity(int quantity);
    Product getProduct();
}
