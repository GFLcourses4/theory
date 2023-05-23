package theory.tarasov.factory;

public class CachedServiceFactoryProvider {
    private static CachedServiceFactoryInit init;

    public static DIFactory getFactory() {
        if(init == null) init = new CachedServiceFactoryInit();
        return init.getFactory();
    }
}
