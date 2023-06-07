package theory.tarasov.exception;

public class UnregisteredClassException extends RuntimeException {
    public UnregisteredClassException(Class<?> type) {
        super("Class isn`t registered in the DI factory: " + type.getName());
    }
}
