package theory.tarasov;

import theory.tarasov.service.CelsiusToFahrenheit;
import theory.tarasov.service.TemperatureConverter;
import theory.tarasov.service.dynamicproxy.DynamicFactoryProvider;
import theory.tarasov.service.proxy.TemperatureConverterProxy;

public class App {
    public static void main(String[] args) {
        var dynamicProxy = DynamicFactoryProvider.createProxy(new CelsiusToFahrenheit(), TemperatureConverter.class);
        dynamicProxy.convert(55);
        dynamicProxy.convert(66);

        var proxy = new TemperatureConverterProxy(new CelsiusToFahrenheit());
        proxy.convert(55);
        proxy.convert(66);
    }
}
