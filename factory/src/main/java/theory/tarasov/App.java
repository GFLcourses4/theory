package theory.tarasov;

import theory.tarasov.calc.Calc;
import theory.tarasov.calc.EngineeringCalc;
import theory.tarasov.calc.EngineeringCalcImpl;
import theory.tarasov.factory.CachedServiceFactoryProvider;
import theory.tarasov.factory.DIFactory;

public class App {
    public static void main(String[] args) {
        DIFactory factory = CachedServiceFactoryProvider.getFactory();
        EngineeringCalc engineeringCalc = factory.createInstance(EngineeringCalc.class);
        Calc calc = factory.createInstance(Calc.class);

        if(engineeringCalc instanceof EngineeringCalcImpl impl) {
            System.out.println(impl.getCalc() == calc);
        }


    }
}
