package theory.tarasov.service;

public class CelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
