public class IntsCalculator implements Ints {
    protected final Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double sum = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        return (int) sum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double mult = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        return (int) mult;
    }

    @Override
    public int pow(int a, int b) {
        double pow = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        return (int) pow;
    }
}
