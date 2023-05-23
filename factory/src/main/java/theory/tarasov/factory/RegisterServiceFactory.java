package theory.tarasov.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class RegisterServiceFactory implements RegisterFactory {
    private static final Map<Class<?>, Function<DIFactory, ?>> context = new HashMap<>();
    @Override
    public <T> T createInstance(Class<T> type, DIFactory factory) {
        return type.cast(context.get(type).apply(factory));
    }

    public static void register(Class<?> type, Function<DIFactory, ?> creator) {
        context.put(type, creator);
    }
}
