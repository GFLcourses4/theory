package theory.tarasov;


import org.slf4j.LoggerFactory;
import theory.tarasov.service.CelsiusToFahrenheit;
import theory.tarasov.service.TemperatureConverter;
import theory.tarasov.service.dynamicproxy.DynamicProxyProvider;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        var proxy_logger = LoggerFactory.getLogger("PROXY_LOGGER");
        var target = new CelsiusToFahrenheit();


        var dynamicProxy = DynamicProxyProvider.createProxy(target, TemperatureConverter.class, proxy_logger);
        dynamicProxy.convert(55);
        dynamicProxy.convert(66);


        var executorService = Executors.newFixedThreadPool(50);
        IntStream.rangeClosed(1, 50).forEach(v -> executorService.execute(() -> dynamicProxy.convert(v)));
        executorService.shutdown();
    }

}
