package theory.tarasov.factory;

import java.util.HashMap;
import java.util.Map;

class CachedServiceFactory implements DIFactory{
    private final Map<Class<?>, Object> cachedInstances;
    private final RegisterServiceFactory factory;
    public CachedServiceFactory(RegisterServiceFactory factory) {
        cachedInstances = new HashMap<>();
        this.factory = factory;
    }
    @Override
    public <T> T createInstance(Class<T> type) {
        if(cachedInstances.containsKey(type)) return type.cast(cachedInstances.get(type));
        else {
            T instance = factory.createInstance(type, this);
            cachedInstances.put(type, instance);
            return instance;
        }
    }
}
