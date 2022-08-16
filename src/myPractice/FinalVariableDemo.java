package myPractice;

public class FinalVariableDemo {
    public static void main(String[] args) {
        final float PI = 3.14f;
        /*
         * PI는 상수로 정의되어 있으므로 새로운 값으로 할당할 수 없다.
         */
//        PI = 1.11;
        System.out.println(PI);
    }
}
