package ua.com.demo.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProductDbService implements Service {

    private final Map<Integer, String> products = new HashMap<>();


    public ProductDbService() {
        fillDb();
    }

    @Override
    public String getProduct(Integer id) {
        return this.products.get(id);
    }

    private void fillDb() {
        for (int i = 0; i < 10; i++)
            products.put(i + 1, "Product-" + i);
    }

    public Map<Integer, String> getProducts() {
        return products;
    }
}
