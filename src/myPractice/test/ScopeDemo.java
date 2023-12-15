package myPractice.test;

public class ScopeDemo {
    public static void main(String[] args) {
        int a = 5;

        method();
    }

    public static void method() {
        int b = 6;

//        System.out.println(a);
        method2();
    }

    public static void method2() {
//        System.out.println(b);
    }
}
