package theory.tarasov.service.dynamicproxy;

import org.slf4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class InvocationHandlerImpl<T> implements InvocationHandler {
    private final T target;
    private final Logger logger;

    InvocationHandlerImpl(T target, Logger logger) {
        this.target = target;
        this.logger = logger;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) {
        logger.info(DynamicProxyLogMessage.EXECUTING_METHOD.getMessage(), method.getName(), target.getClass().getSimpleName(), args);
        var result = invokeMethod(method, args);
        logger.info(DynamicProxyLogMessage.METHOD_EXECUTION_COMPLETED.getMessage(), target.getClass().getSimpleName(), result);
        return result;
    }

    private Object invokeMethod(Method method, Object[] args) {
        try {
            return method.invoke(target, args);
        } catch (InvocationTargetException ex) {
            handleInvocationTargetException(method, ex);
        } catch (IllegalAccessException ex) {
            handleIllegalAccessException(method, ex);
        }
        return null;
    }

    private void handleIllegalAccessException(Method method, IllegalAccessException ex) {
        logger.error(DynamicProxyLogMessage.ILLEGAL_ACCESS_EXCEPTION.getMessage(), target.getClass().getSimpleName(), method.getName(), ex);
        throw new RuntimeException(ex);
    }

    private void handleInvocationTargetException(Method method, InvocationTargetException ex) {
        logger.error(DynamicProxyLogMessage.INVOCATION_TARGET_EXCEPTION.getMessage(), target.getClass().getSimpleName(), method.getName(), ex.getCause());
        throw new RuntimeException(ex.getCause());
    }
}
