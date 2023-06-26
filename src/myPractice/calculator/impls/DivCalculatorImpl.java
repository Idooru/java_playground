package myPractice.calculator.impls;


import myPractice.calculator.Calculator;
import myPractice.calculator.interfaces.DivCalculator;

public class DivCalculatorImpl extends Calculator implements DivCalculator {

    public DivCalculatorImpl(int left, int right) {
        super(left, right, DivCalculatorImpl.class.getSimpleName());
    }

    @Override
    public void divFunction() {
        result = left / right;
    }
}
