package myPractice.calculator;


import myPractice.calculator.enums.CalculatorType;

public class Main {
    public static void main(String[] args) {

        final CalculatorLibrary cl = new CalculatorLibrary(500, 318);

        cl.useCalculate(CalculatorType.MulCalculator);
    }
}
