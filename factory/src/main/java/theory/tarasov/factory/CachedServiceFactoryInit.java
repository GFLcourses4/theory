package theory.tarasov.factory;

import theory.tarasov.calc.Calc;
import theory.tarasov.calc.CalcImpl;
import theory.tarasov.calc.EngineeringCalc;
import theory.tarasov.calc.EngineeringCalcImpl;

class CachedServiceFactoryInit implements ServiceFactoryInitializer {
    private final DIFactory factory;
    public CachedServiceFactoryInit() {
        RegisterServiceFactory.register(Calc.class, (factory) -> new CalcImpl());
        RegisterServiceFactory.register(EngineeringCalc.class,
                (factory) -> new EngineeringCalcImpl(factory.createInstance(Calc.class)));
        factory =  new CachedServiceFactory(new RegisterServiceFactory());
    }
    @Override
    public DIFactory getFactory() {
        return factory;
    }
}
