package theory.tarasov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import theory.tarasov.service.CelsiusToFahrenheit;
import theory.tarasov.service.TemperatureConverter;
import theory.tarasov.service.dynamicproxy.DynamicFactoryProvider;
import theory.tarasov.service.proxy.TemperatureConverterProxy;

public class App {
    public static void main(String[] args) {
        var proxy_logger = LoggerFactory.getLogger("PROXY_LOGGER");
        var target = new CelsiusToFahrenheit();


        var dynamicProxy = DynamicFactoryProvider.createProxy(target, TemperatureConverter.class, proxy_logger);
        dynamicProxy.convert(55);
        dynamicProxy.convert(66);

        var proxy = new TemperatureConverterProxy(proxy_logger, target);
        proxy.convert(55);
        proxy.convert(66);
    }
}
