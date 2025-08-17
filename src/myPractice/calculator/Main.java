package myPractice.calculator;


import myPractice.calculator.enums.CalculatorType;

public class Main {
    public static void main(String[] args) {
        useCalculator(500, 318, CalculatorType.AddCalculator);
        useCalculator(200, 100, CalculatorType.SubCalculator);
    }

    public static void useCalculator(int left, int right, CalculatorType type) {
        CalculatorStrategy.init(left, right);
        Calculator calculator = CalculatorStrategy.getStrategy(type);

        calculator.calculate();
        calculator.console();
    }
}
