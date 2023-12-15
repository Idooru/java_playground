package myPractice.oop1;

// 자동차 인터페이스를 구현한 제네시스 클래스
public class Genesis implements Car {
    @Override
    public void move() {
        System.out.println("move Genesis");
    }

    @Override
    public void stop() {
        System.out.println("stop Genesis");
    }
}
