package theory.tarasov.builder;

import theory.tarasov.model.Product;

public class ProductManualBuilderImpl implements ProductManualBuilder {
    private String manufacturer;
    private final ProductBuilder productBuilder;

    public ProductManualBuilderImpl(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    @Override
    public void setDescription(String description) {
        productBuilder.setDescription(description);
    }

    @Override
    public void setName(String name) {
        productBuilder.setName(name);
    }

    @Override
    public void setPrice(long price) {
        productBuilder.setPrice(price);
    }

    @Override
    public void setQuantity(int quantity) {
        productBuilder.setQuantity(quantity);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public Product getProduct() {
        var product = productBuilder.getProduct();
        product.setManufacturer(manufacturer);
        return product;
    }
}
