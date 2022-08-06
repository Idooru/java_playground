package egoing.basics.typeconversion;

public class ImplicitCast {
    public static void main(String[] args) {
        /* 정수 타입인 상수 10은 실수 타입보다 크기가 작기 때문에 암묵적으로 형변환이
        * 가능해 진다. 이것을 implicit casting 이라고 한다.
        * */
        float a = 10;

        System.out.println(a);
    }
}
