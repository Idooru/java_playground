package myPractice;

import myPractice.Models.Car;

public class ThisMethodDemo {
    public static void main(String[] args) {
        Car car1 = new Car();   // 만약 생성자의 인자가 없을 시 7행에 존재하는 생성자를 통해 인스턴스를 초기화 시킨다.
        System.out.println(car1);

        Car car2 = new Car("black", 2);
        System.out.println(car2);
    }
}
