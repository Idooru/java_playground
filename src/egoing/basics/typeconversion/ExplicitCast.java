package egoing.basics.typeconversion;

public class ExplicitCast {
    public static void main(String[] args) {
        /* 실수 타입은 정수 타입 보다 크기 때문에 implicit casting이 발생하지 않는다.
            따라서 사용자가 직접 형변환을 해줘야 한다. 이것이 명시적 형변환(explicit casting)이라고 한다.
         */
        int a = (int) 10F;

        System.out.printf("%d", a);
    }
}
