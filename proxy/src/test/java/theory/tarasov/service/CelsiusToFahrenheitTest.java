package theory.tarasov.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CelsiusToFahrenheitTest {
    private TemperatureConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new CelsiusToFahrenheit();
    }

    @Test
    public void testConvertPositiveCelsius() {
        double celsius = 25.0;
        double expectedFahrenheit = 77.0;
        double result = converter.convert(celsius);
        Assertions.assertEquals(expectedFahrenheit, result);
    }

    @Test
    public void testConvertNegativeCelsius() {
        double celsius = -10.0;
        double expectedFahrenheit = 14.0;
        double result = converter.convert(celsius);
        Assertions.assertEquals(expectedFahrenheit, result);
    }

    @Test
    public void testConvertZeroCelsius() {
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;
        double result = converter.convert(celsius);
        Assertions.assertEquals(expectedFahrenheit, result);
    }
}