package theory.tarasov.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import theory.tarasov.calc.Calc;
import theory.tarasov.calc.CalcImpl;
import theory.tarasov.calc.EngineeringCalc;
import theory.tarasov.calc.EngineeringCalcImpl;

import static org.junit.jupiter.api.Assertions.*;

public class CachedServiceFactoryInitTest {
    private CachedServiceFactoryInit initializer;

    @BeforeEach
    public void setUp() {
        initializer = new CachedServiceFactoryInit();
    }

    @Test
    public void testGetFactory() {
        DIFactory factory = initializer.getFactory();

        assertNotNull(factory);
    }

    @Test
    public void testIfCalcIsRegistered() {
        Calc calcInstance = initializer.getFactory().createInstance(Calc.class);

        assertNotNull(calcInstance);
        assertInstanceOf(CalcImpl.class, calcInstance);
    }
    @Test
    public void testIfEngineeringCalcIsRegistered() {
        EngineeringCalc calcInstance = initializer.getFactory().createInstance(EngineeringCalc.class);

        assertNotNull(calcInstance);
        assertInstanceOf(EngineeringCalcImpl.class, calcInstance);
    }
}