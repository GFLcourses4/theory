package theory.tarasov;


import theory.tarasov.builder.ProductBuilderImpl;
import theory.tarasov.builder.ProductManualBuilderImpl;
import theory.tarasov.director.DirectorImpl;

public class ProductBuilderProcess {
    public static void main(String[] args) {
        var productBuilder = new ProductBuilderImpl();
        var productManualBuilder = new ProductManualBuilderImpl(productBuilder);
        var director = new DirectorImpl();

        director.constructDefaultProduct(productBuilder);
        var firstProduct = productBuilder.getProduct();
        System.out.println(firstProduct);

        director.constructDefaultProduct(productManualBuilder);
        productManualBuilder.setManufacturer("some manufacturer");
        var secondProduct = productManualBuilder.getProduct();
        System.out.println(secondProduct);
    }
}
