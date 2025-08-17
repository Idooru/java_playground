package myPractice.calculator.impls;


import myPractice.calculator.Calculator;

public class AddCalculatorImpl extends Calculator {

    public AddCalculatorImpl(int left, int right) {
        super(left, right, AddCalculatorImpl.class.getSimpleName(), "+");
    }


    @Override
    protected void calculate() {
        result = left + right;
    }
}
