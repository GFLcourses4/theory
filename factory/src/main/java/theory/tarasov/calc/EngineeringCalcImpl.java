package theory.tarasov.calc;

public class EngineeringCalcImpl implements EngineeringCalc {
    private final Calc calc;
    public EngineeringCalcImpl(Calc calc) {
        this.calc = calc;
    }

    @Override
    public double pov(int a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public int sum(int a, int b) {
        return calc.sum(a, b);
    }

    @Override
    public int sub(int a, int b) {
        return calc.sub(a, b);
    }

    @Override
    public double div(int a, int b) {
        return calc.div(a, b);
    }

    @Override
    public int mult(int a, int b) {
        return calc.mult(a, b);
    }

    public Calc getCalc() {
        return calc;
    }
}
