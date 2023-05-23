package theory.tarasov.factory;

public interface DIFactory {
    <T> T createInstance(Class<T> type);
}
