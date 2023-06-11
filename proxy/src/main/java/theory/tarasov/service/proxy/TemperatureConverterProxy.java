package theory.tarasov.service.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import theory.tarasov.service.TemperatureConverter;

public class TemperatureConverterProxy implements TemperatureConverter {
    private final Logger logger;
    private final TemperatureConverter converter;

    public TemperatureConverterProxy(TemperatureConverter converter) {
        this.converter = converter;
        logger = LoggerFactory.getLogger(TemperatureConverterProxy.class);
    }

    @Override
    public double convert(double value) {
        logger.info(ConverterProxyLogMessage.CONVERSION_PERFORMED.getMessage(), converter.getClass().getSimpleName(), value);
        var result = converter.convert(value);
        logger.info(ConverterProxyLogMessage.CONVERSION_RESULT.getMessage(), result);
        return result;
    }
}
