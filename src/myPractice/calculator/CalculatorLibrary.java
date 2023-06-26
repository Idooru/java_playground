package myPractice.calculator;

import myPractice.calculator.enums.CalculatorType;
import myPractice.calculator.impls.AddCalculatorImpl;
import myPractice.calculator.impls.DivCalculatorImpl;
import myPractice.calculator.impls.MulCalculatorImpl;
import myPractice.calculator.impls.SubCalculatorImpl;

public class CalculatorLibrary {
    private final int left;
    private final int right;

    public CalculatorLibrary(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void useCalculate(CalculatorType calculatorType) {
        switch (calculatorType) {
            case AddCalculator:
                final AddCalculatorImpl addCalculator = new AddCalculatorImpl(left, right);
                addCalculator.addFunction();
                getResult(addCalculator);
                break;
            case SubCalculator:
                final SubCalculatorImpl subCalculator = new SubCalculatorImpl(left, right);
                subCalculator.subFunction();
                getResult(subCalculator);
                break;
            case MulCalculator:
                final MulCalculatorImpl mulCalculator = new MulCalculatorImpl(left, right);
                mulCalculator.mulFunction();
                getResult(mulCalculator);
                break;
            case DivCalculator:
                final DivCalculatorImpl divCalculator = new DivCalculatorImpl(left, right);
                divCalculator.divFunction();
                getResult(divCalculator);
                break;
            default:
                throw new Error("일치하지 않은 계산기 타입 입니다.");
        }
    }

    private void getResult(Calculator calculator) {
        calculator.console();
    }
}
