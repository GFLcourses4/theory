package theory.tarasov.factory.registry;

import theory.tarasov.factory.DIFactory;

import java.util.function.Function;

public interface InstanceRegistry {
    Function<DIFactory, ?> getCreatorFunction(Class<?> type);
}
