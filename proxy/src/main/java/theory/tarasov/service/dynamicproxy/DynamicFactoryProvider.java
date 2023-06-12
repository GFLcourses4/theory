package theory.tarasov.service.dynamicproxy;

import org.slf4j.Logger;

import java.lang.reflect.Proxy;

public class DynamicFactoryProvider {
    public static <T> T createProxy(T target, Class<T> tInterface, Logger logger) {
        var handler = new InvocationHandlerImpl<>(target, logger);
        return tInterface.cast(Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler)
        );
    }
}
