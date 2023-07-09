package myPractice.calculator2;

import myPractice.calculator2.strategy.AddStrategy;
import myPractice.calculator2.strategy.DivStrategy;
import myPractice.calculator2.strategy.MulStrategy;
import myPractice.calculator2.strategy.SubStrategy;

class CalculatorRunner {

    private String mode;
    private String operator;
    private float arg1;
    private float arg2;
    private float result;


    public void runCalculate(Calculatable calculator) {
        mode = calculator.getClass().getSimpleName();
        operator = calculator.getOperator();
        arg1 = calculator.getArgOne();
        arg2 = calculator.getArgTwo();
        result = calculator.calculate();
    }


    public String getFormat() {
        return String.format("[%s] %f %s %f = %f", mode, arg1, operator, arg2, result);
    }
}

public class CalculatorDriver {
    private static final CalculatorRunner calculatorRunner = new CalculatorRunner();

    public static void main(String[] args) {
        final String add = add(5, 3);
        final String sub = sub(4, 2);
        final String mul = mul(10, 3);
        final String div = div(6, 2);

        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
    }

    public static String add(float arg1, float arg2) {
        calculatorRunner.runCalculate(new AddStrategy(arg1, arg2));
        return calculatorRunner.getFormat();
    }

    public static String sub(float arg1, float arg2) {
        calculatorRunner.runCalculate(new SubStrategy(arg1, arg2));
        return calculatorRunner.getFormat();
    }

    public static String mul(float arg1, float arg2) {
        calculatorRunner.runCalculate(new MulStrategy(arg1, arg2));
        return calculatorRunner.getFormat();
    }

    public static String div(float arg1, float arg2) {
        calculatorRunner.runCalculate(new DivStrategy(arg1, arg2));
        return calculatorRunner.getFormat();
    }
}
