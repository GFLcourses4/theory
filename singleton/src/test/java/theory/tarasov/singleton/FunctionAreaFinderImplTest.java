package theory.tarasov.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

class FunctionAreaFinderImplTest {
    private FunctionAreaFinderImpl areaFinder;

    @BeforeEach
    public void setUp() {
        areaFinder = new FunctionAreaFinderImpl();
    }

    @Test
    public void testCalculateTrapezoidalArea_LinearFunction() {
        Function<Double, Double> linearFunction = x -> x;

        double result = areaFinder.calculate(linearFunction, 0, 1, 100);

        double expected = 0.5;
        Assertions.assertThat(result).isCloseTo(expected, Assertions.offset(0.0001));
    }

    @Test
    public void testCalculateTrapezoidalArea_SquareFunction() {
        Function<Double, Double> squareFunction = x -> x * x;

        double result = areaFinder.calculate(squareFunction, 0, 1, 100);

        double expected = 0.333;
        Assertions.assertThat(result).isCloseTo(expected, Assertions.offset(0.001));
    }
}