package theory.tarasov.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class AreaFinderProviderTest {
    @Test
    public void testGetFunctionAreaFinder_ReturnsNotNull() {
        FunctionAreaFinder functionAreaFinder = AreaFinderProvider.getFunctionAreaFinder();
        Assertions.assertThat(functionAreaFinder).isNotNull();
    }

    @Test
    public void testGetFunctionAreaFinder_ReturnsSingletonInstance() {
        FunctionAreaFinder functionAreaFinder1 = AreaFinderProvider.getFunctionAreaFinder();
        FunctionAreaFinder functionAreaFinder2 = AreaFinderProvider.getFunctionAreaFinder();

        Assertions.assertThat(functionAreaFinder1).isSameAs(functionAreaFinder2);
    }
}