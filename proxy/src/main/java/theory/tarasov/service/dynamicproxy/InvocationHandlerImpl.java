package theory.tarasov.service.dynamicproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
    private final Object target;
    private final Logger logger;

    InvocationHandlerImpl(Object target) {
        this.target = target;
        logger = LoggerFactory.getLogger(InvocationHandlerImpl.class);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) {
        logger.info("Executing method {} in class {} with arguments {}", method.getName(), target.getClass().getSimpleName(), args);
        var result = invokeMethod(method, args);
        logger.info("Method execution completed in class {}: Result - {}", target.getClass().getSimpleName(), result);
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
        logger.error("Method execution failed due to illegal access in class {}: {}", target.getClass().getSimpleName(), method.getName(), ex);
        throw new RuntimeException(ex);
    }

    private void handleInvocationTargetException(Method method, InvocationTargetException ex) {
        logger.error("Method execution failed in class {}: {}", target.getClass().getSimpleName(), method.getName(), ex.getCause());
        throw new RuntimeException(ex.getCause());
    }
}
