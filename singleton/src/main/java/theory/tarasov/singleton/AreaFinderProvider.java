package theory.tarasov.singleton;

public class AreaFinderProvider {
    private static FunctionAreaFinder functionAreaFinder;

    private AreaFinderProvider() {
    }

    public static FunctionAreaFinder getFunctionAreaFinder() {
        if (functionAreaFinder == null) functionAreaFinder = new FunctionAreaFinderImpl();
        return functionAreaFinder;
    }
}
