package myPractice.accessModifier.own;

public class ClassB {
    public static void main(String[] args) {
        System.out.println(ClassA.defOnA);
        System.out.println(ClassA.proOnA);
        System.out.println(ClassA.pubOnA);
        /*
         * private 접근제어자를 제외한 모든 변수들 불러올 수 있다.
         * 같은 패키지를 사용하기 때문에 default, protected 접근제어자가
         * 사용 가능해지고 public은 접근을 제어하지 않는다.
         */
    }
}
