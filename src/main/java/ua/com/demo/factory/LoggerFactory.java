package ua.com.demo.factory;

import ua.com.demo.singleton.Logger;

public interface LoggerFactory {

    Logger createLogger(Class<? extends Logger> clazz);

}
