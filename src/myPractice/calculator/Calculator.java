package myPractice.calculator;

public abstract class Calculator {
    protected final int left;
    protected final int right;
    protected final String className;
    protected int result;

    protected Calculator(int left, int right, String className) {
        this.left = left;
        this.right = right;
        this.className = className;
    }

    void console() {
        final String classNameFormat = String.format("[%s] The %s calculator is executed\n", className, className);
        final String resultFormat = String.format("[result] The result is %d\n", result);
        System.out.printf(classNameFormat);
        System.out.printf(resultFormat);
    }
}
