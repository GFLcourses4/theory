package theory.tarasov;

import theory.tarasov.singleton.AreaFinderProvider;

public class App {
    public static void main(String[] args) {
        var areaFinder = AreaFinderProvider.getFunctionAreaFinder();
        System.out.println(areaFinder.calculate(x -> Math.pow(x, 2), 0, 1, 100));
        System.out.println(areaFinder.calculate(x -> x + 10, 3, 7, 1000));
        System.out.println(areaFinder.calculate(Math::exp, 0, 1, 10000));
        System.out.println(areaFinder.calculate(Math::sin, 0, Math.PI / 2, 100000));
        System.out.println(areaFinder == AreaFinderProvider.getFunctionAreaFinder());
    }
}
