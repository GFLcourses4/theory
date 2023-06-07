package theory.tarasov.factory;

import theory.tarasov.calc.Calc;
import theory.tarasov.calc.CalcImpl;
import theory.tarasov.calc.EngineeringCalc;
import theory.tarasov.calc.EngineeringCalcImpl;
import theory.tarasov.factory.registry.ServiceRegistry;

class CachedServiceFactoryInit implements ServiceFactoryInitializer {
    private final DIFactory factory;
    public CachedServiceFactoryInit() {
        ServiceRegistry.register(Calc.class, (factory) -> new CalcImpl());
        ServiceRegistry.register(EngineeringCalc.class,
                (factory) -> new EngineeringCalcImpl(factory.createInstance(Calc.class)));
        factory =  new CachedServiceFactory(new ServiceRegistry());
    }
    @Override
    public DIFactory getFactory() {
        return factory;
    }
}
