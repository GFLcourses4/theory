package theory.tarasov.service.dynamicproxy;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

class InvocationHandlerImplTest {
    private Logger mockLogger;

    private InvocationHandlerImpl<MyInterface> invocationHandler;
    private MyInterface mockTarget;

    @BeforeEach
    void setUp() {
        mockLogger = Mockito.mock(Logger.class);
        mockTarget = Mockito.mock(MyInterface.class);
        invocationHandler = new InvocationHandlerImpl<>(mockTarget, mockLogger);
    }

    @Test
    public void testInvoke() throws NoSuchMethodException {
        var method = MyInterface.class.getMethod("doSomething", double.class);
        var args = new Object[]{3.D};
        when(mockTarget.doSomething(anyDouble())).thenReturn(5.D);
        var result = invocationHandler.invoke(null, method, args);
        verify(mockLogger).info(DynamicProxyLogMessage.EXECUTING_METHOD.getMessage(), method.getName(), mockTarget.getClass().getSimpleName(), args);
        verify(mockLogger).info(DynamicProxyLogMessage.METHOD_EXECUTION_COMPLETED.getMessage(), mockTarget.getClass().getSimpleName(), result);
    }

    @Test
    public void testInvoke_shouldHandleInvocationTargetExceptionAndThrowRuntimeException() throws NoSuchMethodException {
        var method = MyInterface.class.getMethod("doSomething", double.class);
        var args = new Object[]{3.D};
        var targetException = new RuntimeException();
        when(mockTarget.doSomething(anyDouble())).thenThrow(targetException);
        assertThatThrownBy(() -> invocationHandler.invoke(null, method, args))
                .isInstanceOf(RuntimeException.class)
                .hasCause(targetException);
        verify(mockLogger).info(DynamicProxyLogMessage.EXECUTING_METHOD.getMessage(), method.getName(), mockTarget.getClass().getSimpleName(), args);
        verify(mockLogger).error(DynamicProxyLogMessage.INVOCATION_TARGET_EXCEPTION.getMessage(), mockTarget.getClass().getSimpleName(), method.getName(), targetException);
    }

    @Test
    public void testInvoke_shouldHandleIllegalAccessExceptionAndThrowRuntimeException() throws InvocationTargetException, IllegalAccessException {
        var args = new Object[]{3.D};
        var targetException = new IllegalAccessException();
        var mockMethod = Mockito.mock(Method.class);
        doThrow(targetException).when(mockMethod).invoke(any(), any());
        assertThatThrownBy(() -> invocationHandler.invoke(null, mockMethod, args))
                .isInstanceOf(RuntimeException.class)
                .hasCause(targetException);
        verify(mockLogger).info(DynamicProxyLogMessage.EXECUTING_METHOD.getMessage(), mockMethod.getName(), mockTarget.getClass().getSimpleName(), args);
        verify(mockLogger).error(DynamicProxyLogMessage.ILLEGAL_ACCESS_EXCEPTION.getMessage(), mockTarget.getClass().getSimpleName(), mockMethod.getName(), targetException);
    }

    interface MyInterface {
        double doSomething(double value);
    }
}
