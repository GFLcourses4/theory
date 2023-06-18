package theory.tarasov.service.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import theory.tarasov.service.TemperatureConverter;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


class TemperatureConverterProxyTest {
    private Logger logger;
    private TemperatureConverter converter;
    private TemperatureConverterProxy proxy;

    @BeforeEach
    public void setUp() {
        converter = Mockito.mock(TemperatureConverter.class);
        logger = Mockito.mock(Logger.class);
        proxy = new TemperatureConverterProxy(logger, converter);

    }

    @Test
    public void testConvert() {
        double value = 25.0;
        double expectedResult = 77.0;

        when(converter.convert(value)).thenReturn(expectedResult);

        double result = proxy.convert(value);

        Assertions.assertEquals(expectedResult, result);
        verify(logger).info(ConverterProxyLogMessage.CONVERSION_PERFORMED.getMessage(), converter.getClass().getSimpleName(), value);
        verify(logger).info(ConverterProxyLogMessage.CONVERSION_RESULT.getMessage(), expectedResult);
        verify(converter).convert(value);
    }
}
