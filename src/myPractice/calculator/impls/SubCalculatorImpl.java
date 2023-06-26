package myPractice.calculator.impls;


import myPractice.calculator.Calculator;
import myPractice.calculator.interfaces.SubCalculator;

public class SubCalculatorImpl extends Calculator implements SubCalculator {

    public SubCalculatorImpl(int left, int right) {
        super(left, right, SubCalculatorImpl.class.getSimpleName());
    }

    @Override
    public void subFunction() {
        result = left - right;
    }
}
