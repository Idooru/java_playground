package myPractice.test;

class IntA {
    public int a = 1;
}

class IntB {
    public int b = 1;
}


public class EqualDemo {
    public static void main(String[] args) {
        int a = new IntA().a;
        int b = new IntB().b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.printf("a == b %b%n", a == b);
    }
}
