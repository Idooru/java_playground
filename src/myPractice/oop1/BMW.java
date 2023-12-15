package myPractice.oop1;

// 자동차 인터페이스를 구현한 비엠더블유 클래스
public class BMW implements Car {
    @Override
    public void move() {
        System.out.println("move BMW");
    }

    @Override
    public void stop() {
        System.out.println("stop BMW");
    }
}
