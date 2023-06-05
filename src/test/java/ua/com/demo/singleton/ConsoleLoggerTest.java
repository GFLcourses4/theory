package ua.com.demo.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsoleLoggerTest {

    private Logger consoleLogger;


    @Before
    public void setUp() {
        consoleLogger = ConsoleLogger.getLogger();
    }

    @Test
    public void testInfoLog() {
        String infoLogMessage = "User created";
        LogType logType = LogType.INFO;

        Assert.assertEquals("[INFO   ] --> User created", consoleLogger.log(infoLogMessage, logType));
    }

    @Test
    public void testWarningLog() {
        String warningLogMessage = "User already exists";
        LogType logType = LogType.WARNING;

        Assert.assertEquals("[WARNING] --> User already exists", consoleLogger.log(warningLogMessage, logType));
    }

    @Test
    public void testErrorLog() {
        String errorLogMessage = "Invalid user input";
        LogType logType = LogType.ERROR;

        Assert.assertEquals("[ERROR  ] --> Invalid user input", consoleLogger.log(errorLogMessage, logType));
    }

    @Test
    public void testSingletonEquality() {
        Logger theConsoleLogger = ConsoleLogger.getLogger();

        Assert.assertSame(consoleLogger, theConsoleLogger);
    }

}
