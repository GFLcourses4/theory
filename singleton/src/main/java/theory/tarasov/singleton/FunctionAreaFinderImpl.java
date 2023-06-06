package theory.tarasov.singleton;

import java.util.function.Function;
import java.util.stream.IntStream;

public class FunctionAreaFinderImpl implements FunctionAreaFinder {
    @Override
    public double calculate(Function<Double, Double> function, double start, double end, int numOfPoints) {
        return Math.round(calculateTrapezoidalArea(function, start, end, numOfPoints) * 1000) / 1000D;
    }

    private double calculateTrapezoidalArea(Function<Double, Double> function, double n, double m, int numOfPoints) {
        double height = (m - n) / numOfPoints;
        double midPoint = (function.apply(n) + function.apply(m)) / 2;
        return IntStream.range(1, numOfPoints).boxed()
                .map(v -> n + v * height).map(function)
                .reduce(midPoint, Double::sum) * height;
    }
}
