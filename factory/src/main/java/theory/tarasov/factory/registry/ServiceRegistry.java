package theory.tarasov.factory.registry;

import theory.tarasov.exception.UnregisteredClassException;
import theory.tarasov.factory.DIFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ServiceRegistry implements InstanceRegistry {
    private static final Map<Class<?>, Function<DIFactory, ?>> context = new HashMap<>();

    @Override
    public Function<DIFactory, ?> getCreatorFunction(Class<?> type) {
        return Optional.ofNullable(context.get(type))
                .orElseThrow(() -> new UnregisteredClassException(type));
    }

    public static void register(Class<?> type, Function<DIFactory, ?> creator) {
        context.put(type, creator);
    }

}
