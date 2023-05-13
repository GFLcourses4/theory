package theory.tarasov.builder;

import theory.tarasov.model.Product;

public interface ProductBuilder {
    void setDescription(String description);
    void setName(String name);
    void setPrice(long price);
    void setQuantity(int quantity);
    Product getProduct();
}
