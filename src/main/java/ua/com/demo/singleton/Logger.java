package ua.com.demo.singleton;

public class Logger {

    private static Logger logger;

    private Logger() {}


    public static Logger getLogger() {
        if (logger == null) logger = new Logger();

        return logger;
    }

    public String log(String message, LogType logType) {
        return String.format("[%-7s] --> %s", logType.name(), message);
    }
}
