package myPractice.oop1;

// 자동차 인터페이스를 구현한 테슬라 클래스
public class Tesla implements Car {
    @Override
    public void move() {
        System.out.println("move Tesla");
    }

    @Override
    public void stop() {
        System.out.println("stop Tesla");
    }
}
