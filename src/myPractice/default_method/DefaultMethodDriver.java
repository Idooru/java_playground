package myPractice.default_method;

interface InterfaceA {
    int a = 10;

    default void testDefaultMethod() {
        System.out.println("a = " + a);
        System.out.println("call default method");
    }

    void testAbstractMethod();
}

class ClassA implements InterfaceA {
    public void testClass() {
        testDefaultMethod();
    }

    @Override
    public void testAbstractMethod() {
        System.out.println("call abstract method");
    }
}

public class DefaultMethodDriver {
    public static void main(String[] args) {
        InterfaceA a = new ClassA();

        a.testDefaultMethod();
        a.testAbstractMethod();
    }
}
