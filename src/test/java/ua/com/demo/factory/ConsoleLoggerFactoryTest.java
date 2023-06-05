package ua.com.demo.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.demo.singleton.ConsoleLogger;
import ua.com.demo.singleton.Logger;

public class ConsoleLoggerFactoryTest {

    private LoggerFactory loggerFactory;


    @Before
    public void setUp() {
        this.loggerFactory = new ConsoleLoggerFactory();
    }

    @Test
    public void testSuccessfulCreation() {
        Logger logger = ConsoleLogger.getLogger();

        Assert.assertEquals(logger, loggerFactory.createLogger(ConsoleLogger.class));
    }

    @Test
    public void testFailedCreation() {
        Logger logger = ConsoleLogger.getLogger();

        Assert.assertThrows(Exception.class, () -> loggerFactory.createLogger(null));
    }
}
