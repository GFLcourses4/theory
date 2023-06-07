package theory.tarasov.factory;

import theory.tarasov.factory.registry.InstanceRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class CachedServiceFactory implements DIFactory{
    private final Map<Class<?>, Object> cachedInstances;
    private final InstanceRegistry registry;
    public CachedServiceFactory(InstanceRegistry registry) {
        cachedInstances = new HashMap<>();
        this.registry = registry;
    }
    @Override
    public <T> T createInstance(Class<T> type) {
        return Optional.ofNullable(cachedInstances.get(type))
                .map(type::cast).orElseGet(() -> cacheInstance(type));
    }

    private <T> T cacheInstance(Class<T> type) {
        T instance = type.cast(registry.getCreatorFunction(type).apply(this));
        cachedInstances.put(type, instance);
        return instance;
    }


}
