package myPractice.calculator.impls;


import myPractice.calculator.Calculator;
import myPractice.calculator.interfaces.AddCalculator;

public class AddCalculatorImpl extends Calculator implements AddCalculator {

    public AddCalculatorImpl(int left, int right) {
        super(left, right, AddCalculatorImpl.class.getSimpleName());
    }

    @Override
    public void addFunction() {
        result = left + right;
    }
}
