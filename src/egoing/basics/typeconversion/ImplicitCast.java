package egoing.basics.typeconversion;

public class ImplicitCast {
    public static void main(String[] args) {
        /* 정수 타입인 상수 10은 실수 타입보다 크기가 작기 때문에 암묵적으로 형변환이
        * 가능해 진다. 이것을 implicit casting이라고 한다.
        * */
        float a = 10; // 10은 정수(int)이고 10f는 실수이다. 정수는 실수보다 타입의 크기가 작기 때문에 형변환이 가능하다.
        long b = 10000;
        long c = 100000000000L;
        /* 10은 정수(–2,147,483,648 ~ 2,147,483,647)이고 10L은 long(–2,147,483,648 ~ 2,147,483,647)이다.
         * int 자료형 역시 long보다 작으므로 long타입에 대입이 가능하지만 만약 int 자료형 보다 큰 값을 대입할 시
         * L을 삽입해야 한다.
         * */

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
