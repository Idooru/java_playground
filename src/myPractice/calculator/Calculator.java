package myPractice.calculator;

public abstract class Calculator {
    protected final int left;
    protected final int right;
    protected final String className;
    protected final String operator;
    protected int result;

    protected Calculator(int left, int right, String className, String operator) {
        this.left = left;
        this.right = right;
        this.className = className;
        this.operator = operator;
    }

    void console() {
        String classNameFormat = String.format("[%s] The %s calculator is executed\n", className, className);
        String resultFormat = String.format("[result] %d %s %d = %d\n", left, operator, right, result);
        System.out.printf(classNameFormat);
        System.out.printf(resultFormat);
    }

    protected abstract void calculate();
}
