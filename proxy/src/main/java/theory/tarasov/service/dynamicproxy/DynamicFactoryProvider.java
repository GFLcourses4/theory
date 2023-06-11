package theory.tarasov.service.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicFactoryProvider {
    public static <T> T createProxy(T target, Class<T> tInterface) {
        var handler = new InvocationHandlerImpl<>(target);
        return tInterface.cast(Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler)
        );
    }
}
