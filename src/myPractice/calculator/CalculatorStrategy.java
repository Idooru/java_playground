package myPractice.calculator;

import myPractice.calculator.enums.CalculatorType;
import myPractice.calculator.impls.AddCalculatorImpl;
import myPractice.calculator.impls.DivCalculatorImpl;
import myPractice.calculator.impls.MulCalculatorImpl;
import myPractice.calculator.impls.SubCalculatorImpl;

import java.util.HashMap;
import java.util.Map;

import static myPractice.calculator.enums.CalculatorType.*;

public class CalculatorStrategy {
    private static final Map<CalculatorType, Calculator> strategies = new HashMap<>();

    public static void init(int left, int right) {
        strategies.put(AddCalculator, new AddCalculatorImpl(left, right));
        strategies.put(SubCalculator, new SubCalculatorImpl(left, right));
        strategies.put(MulCalculator, new MulCalculatorImpl(left, right));
        strategies.put(DivCalculator, new DivCalculatorImpl(left, right));
    }

    public static Calculator getStrategy(CalculatorType type) {
        return strategies.get(type);
    }
}
