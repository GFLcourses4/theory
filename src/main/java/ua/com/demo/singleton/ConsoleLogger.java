package ua.com.demo.singleton;

public class ConsoleLogger implements Logger {

    private static Logger logger;

    private ConsoleLogger() {}


    public static ConsoleLogger getLogger() {
        if (logger == null) logger = new ConsoleLogger();

        return (ConsoleLogger) logger;
    }

    @Override

    public String log(String message, LogType logType) {
        return String.format("[%-7s] --> %s", logType.name(), message);
    }


}
