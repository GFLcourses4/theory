package theory.tarasov.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class ServiceRegistry implements InstanceRegistry {
    private static final Map<Class<?>, Function<DIFactory, ?>> context = new HashMap<>();

    @Override
    public Function<DIFactory, ?> getCreatorFunction(Class<?> type) {
        return context.get(type);
    }

    public static void register(Class<?> type, Function<DIFactory, ?> creator) {
        context.put(type, creator);
    }

}
