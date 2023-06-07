package theory.tarasov.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import theory.tarasov.exception.UnregisteredClassException;
import theory.tarasov.factory.registry.ServiceRegistry;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceRegistryTest {
    private ServiceRegistry registry;

    @BeforeEach
    public void setUp() {
        registry = new ServiceRegistry();
    }

    @Test
    public void testGetCreatorFunction() {
        Class<?> type = MyClass.class;
        Function<DIFactory, ?> creator = factory -> new MyClass();

        ServiceRegistry.register(type, creator);

        Function<DIFactory, ?> retrievedCreator = registry.getCreatorFunction(type);

        assertNotNull(retrievedCreator);
        assertSame(creator, retrievedCreator);
    }

    @Test
    public void testGetCreatorFunction_UnregisteredClassException() {
        Class<?> unregisteredType = UnregisteredClass.class;

        assertThrows(UnregisteredClassException.class, () ->
                registry.getCreatorFunction(unregisteredType));
    }


    private static class UnregisteredClass {
    }


    private static class MyClass {
    }

}