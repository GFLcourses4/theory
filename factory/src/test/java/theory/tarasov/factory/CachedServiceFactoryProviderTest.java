package theory.tarasov.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CachedServiceFactoryProviderTest {

    @Test
    public void testGetFactory() {
        DIFactory factory1 = CachedServiceFactoryProvider.getFactory();
        DIFactory factory2 = CachedServiceFactoryProvider.getFactory();

        assertNotNull(factory1);
        assertNotNull(factory2);
        assertSame(factory1, factory2);
    }
}