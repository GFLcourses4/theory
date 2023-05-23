package theory.tarasov.calc;


public class CalcImpl implements Calc{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double div(int a, int b) {
        return a * 1.D / b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }
}
