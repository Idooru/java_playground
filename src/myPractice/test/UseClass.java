package myPractice.test;

import java.util.Arrays;

class A {
    private int a;

    public void getA() {
        System.out.println("a = " + a);
    }

    public void useArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }
}

public class UseClass {
    public static void main(String[] args) {
        A a = new A();
        a.getA();

        final int[] arr = new int[] {1, 2, 3, 4};
        a.useArray(arr);
    }
}
