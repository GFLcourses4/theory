package theory.tarasov.singleton;

import java.util.function.Function;

public interface FunctionAreaFinder {
    double calculate(Function<Double, Double> function, double start, double end, int numOfPoints);
}
