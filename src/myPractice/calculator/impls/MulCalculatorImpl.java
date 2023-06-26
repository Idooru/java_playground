package myPractice.calculator.impls;

import org.javaground.oop.calculator.Calculator;
import org.javaground.oop.calculator.interfaces.MulCalculator;

public class MulCalculatorImpl extends Calculator implements MulCalculator {

    public MulCalculatorImpl(int left, int right) {
        super(left, right, MulCalculatorImpl.class.getSimpleName());
    }

    @Override
    public void mulFunction() {
        result = left * right;
    }
}
