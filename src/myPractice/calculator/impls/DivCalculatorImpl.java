package myPractice.calculator.impls;


import myPractice.calculator.Calculator;

public class DivCalculatorImpl extends Calculator {

    public DivCalculatorImpl(int left, int right) {
        super(left, right, DivCalculatorImpl.class.getSimpleName(), "/");
    }

    @Override
    protected void calculate() {
        result = left / right;
    }
}
