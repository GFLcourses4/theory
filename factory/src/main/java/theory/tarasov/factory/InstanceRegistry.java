package theory.tarasov.factory;

import java.util.function.Function;

public interface InstanceRegistry {
    Function<DIFactory, ?> getCreatorFunction(Class<?> type);
}
