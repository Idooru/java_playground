package myPractice.calculator.impls;


import myPractice.calculator.Calculator;

public class MulCalculatorImpl extends Calculator {

    public MulCalculatorImpl(int left, int right) {
        super(left, right, MulCalculatorImpl.class.getSimpleName(), "*");
    }


    @Override
    protected void calculate() {
        result = left * right;
    }
}
