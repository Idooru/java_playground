package myPractice.accessModifier.another;

import myPractice.accessModifier.own.ClassA;

public class ClassC {
    public static void main(String[] args) {
        System.out.println(ClassA.pubOnA);
        /*
         * 같은 패키지가 아니고 클래스도 당연히 같지 않으므로
         * public을 제외한 접근제어자가 적용된 변수들을 사용할 수 없다.
         */
    }
}
