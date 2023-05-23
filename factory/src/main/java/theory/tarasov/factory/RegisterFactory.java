package theory.tarasov.factory;

interface RegisterFactory {
    <T> T createInstance(Class<T> type, DIFactory factory);
}
