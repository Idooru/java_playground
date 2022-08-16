package myPractice;

class Static {
    static {
        System.out.println("클래스를 호출할 때 실행됩니다.");
    }

    static void runStatic() {
        System.out.println("스테틱 실행");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        Static.runStatic();
    }
}
