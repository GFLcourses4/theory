package ua.com.demo.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTest {

    private Logger logger;


    @Before
    public void setUp() throws Exception {
        logger = Logger.getLogger();
    }

    @Test
    public void testInfoLog() {
        String infoLogMessage = "User created";
        LogType logType = LogType.INFO;

        Assert.assertEquals("[INFO   ] --> User created", logger.log(infoLogMessage, logType));
    }

    @Test
    public void testWarningLog() {
        String warningLogMessage = "User already exists";
        LogType logType = LogType.WARNING;

        Assert.assertEquals("[WARNING] --> User already exists", logger.log(warningLogMessage, logType));
    }

    @Test
    public void testErrorLog() {
        String errorLogMessage = "Invalid user input";
        LogType logType = LogType.ERROR;

        Assert.assertEquals("[ERROR  ] --> Invalid user input", logger.log(errorLogMessage, logType));
    }

    @Test
    public void testSingletonEquality() {
        Logger theLogger = Logger.getLogger();

        Assert.assertSame(logger, theLogger);
    }

}
