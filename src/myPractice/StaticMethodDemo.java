package myPractice;

class TestStaticMethod {
    public int number = 5;

    public void instanceMethod() {
        System.out.println("I'm instance method");
    }

    public static void referenceInstanceMethod() {
//        this.number;
//        this.instanceMethod();
        System.out.println("스테틱 메서드는 전역 변수, 인스턴스 메서드에 접근 할 수 없습니다.");
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        TestStaticMethod.referenceInstanceMethod();
        /* 스테틱 메서드 혹은 변수는 클레스 내부의 변수, 메서드(인스턴스 변수, 메서드) 등의 접근이
         * 불가능하므로 가급적이면 독립된 메서드의 기능을 작성하는것이 좋다.
         */

        TestStaticMethod tsm = new TestStaticMethod();
        tsm.instanceMethod();
        tsm.referenceInstanceMethod();
        /* 만약 인스턴스로서 스테틱 메서드의 접근할 경우 접근은 가능하다.
           인스턴스를 사용할 수 있다는것은 인스턴스가 생성되었다는 것이며
           생성된 인스턴스에는 인스턴스 멤버와 클레스 맴버가 공존하기 때문이다.
         */
    }
}
