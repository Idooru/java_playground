package myPractice.calculator;


import myPractice.calculator.enums.CalculatorType;

public class Main {
    public static void main(String[] args) {

        final CalculatorLibrary cl = new CalculatorLibrary(500, 318);
        final CalculatorType type = CalculatorType.AddCalculator;

        cl.useCalculate(type);
    }
}
