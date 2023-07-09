package myPractice.calculator2.strategy;

import myPractice.calculator2.Calculatable;
import myPractice.calculator2.Calculator;

public class MulStrategy extends Calculator implements Calculatable {

    public MulStrategy(float arg1, float arg2) {
        super(arg1, arg2);
    }

    @Override
    public float calculate() {
        return arg1 * arg2;
    }

    @Override
    public float getArgOne() {
        return arg1;
    }

    @Override
    public float getArgTwo() {
        return arg2;
    }

    @Override
    public String getOperator() {
        return "x";
    }
}
