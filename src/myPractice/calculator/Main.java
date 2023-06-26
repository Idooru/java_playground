package myPractice.calculator;

import org.javaground.oop.calculator.enums.CalculatorType;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

        final CalculatorLibrary cl = new CalculatorLibrary(5, 3);

        cl.useCalculate(CalculatorType.SubCalculator);
    }
}
