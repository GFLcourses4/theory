package ua.com.demo.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProductDbServiceProxy implements Service {

    private final Service service;

    private final Map<Integer, String> cache = new HashMap<>();

    public ProductDbServiceProxy(Service service) {
        this.service = service;
    }


    @Override
    public String getProduct(Integer id) {
        String res = this.cache.computeIfAbsent(id, (Integer theId) -> {
            String temp = service.getProduct(theId);
            this.cache.put(theId, temp);
            return temp;
        });

        return res.isBlank() ? this.cache.get(id) : res;
    }

    public void resetCache() {
        this.cache.clear();
    }

    public Map<Integer, String> getCache() {
        return cache;
    }
}
