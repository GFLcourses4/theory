package theory.tarasov.director;

import theory.tarasov.builder.ProductBuilder;

public class DirectorImpl implements Director {
    @Override
    public void constructDefaultProduct(ProductBuilder builder) {
        builder.setName("some name");
        builder.setDescription("some description");
        builder.setPrice(100L);
        builder.setQuantity(55);
    }
}
