package ua.com.demo.factory;

import ua.com.demo.singleton.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConsoleLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger(Class<? extends Logger> clazz) {
        Logger logger = null;

        try {
            Method method = clazz.getDeclaredMethod("getLogger");
            logger = clazz.cast(method.invoke(method));
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        return logger;
    }
}
