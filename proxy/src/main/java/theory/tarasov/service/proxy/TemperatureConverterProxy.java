package theory.tarasov.service.proxy;

import org.slf4j.Logger;
import theory.tarasov.service.TemperatureConverter;

public class TemperatureConverterProxy implements TemperatureConverter {
    private final Logger logger;
    private final TemperatureConverter converter;

    public TemperatureConverterProxy(Logger logger, TemperatureConverter converter) {
        this.logger = logger;
        this.converter = converter;

    }

    @Override
    public double convert(double value) {
        logger.info(ConverterProxyLogMessage.CONVERSION_PERFORMED.getMessage(), converter.getClass().getSimpleName(), value);
        var result = converter.convert(value);
        logger.info(ConverterProxyLogMessage.CONVERSION_RESULT.getMessage(), result);
        return result;
    }
}
