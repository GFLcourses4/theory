package ua.com.demo.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProxyTest {

    private ProductDbServiceProxy proxy;

    private ProductDbService service;


    @Before
    public void setUp() {
        this.service = new ProductDbService();
        this.proxy = new ProductDbServiceProxy(this.service);
    }

    @Test
    public void testTheSameParent() {
        Assert.assertEquals(Service.class, this.proxy.getClass().getInterfaces()[0]);
        Assert.assertEquals(Service.class ,this.service.getClass().getInterfaces()[0]);
    }

}
