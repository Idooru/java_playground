package myPractice.test;

class GlobalVariable {
    int a = 10;
}

public class GlobalVariableDemo {
    public static void main(String[] args) {
        GlobalVariable gv = new GlobalVariable();

        System.out.println(gv.a);
    }
}
