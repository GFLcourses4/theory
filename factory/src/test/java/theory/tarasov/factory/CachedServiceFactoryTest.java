package theory.tarasov.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

public class CachedServiceFactoryTest {
    private CachedServiceFactory factory;

    @BeforeEach
    public void setUp() {
        InstanceRegistry registry = new ServiceRegistry();
        factory = new CachedServiceFactory(registry);
    }

    @Test
    public void testCreateInstance_CachedInstance() {
        Class<?> type = MyClass.class;
        MyClass instance = new MyClass();
        Function<DIFactory, ?> creator = factory -> instance;

        ServiceRegistry.register(type, creator);

        MyClass createdInstance1 = (MyClass) factory.createInstance(type);
        MyClass createdInstance2 = (MyClass) factory.createInstance(type);

        assertNotNull(createdInstance1);
        assertNotNull(createdInstance2);
        assertSame(instance, createdInstance1);
        assertSame(instance, createdInstance2);
    }

    private static class MyClass {
        // Test class
    }
}