package myPractice.calculator.impls;


import myPractice.calculator.Calculator;

public class SubCalculatorImpl extends Calculator {

    public SubCalculatorImpl(int left, int right) {
        super(left, right, SubCalculatorImpl.class.getSimpleName(), "-");
    }

    @Override
    protected void calculate() {
        result = left - right;
    }
}
