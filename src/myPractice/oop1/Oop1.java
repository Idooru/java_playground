package myPractice.oop1;

import java.util.ArrayList;
import java.util.List;

public class Oop1 {
    public static void main(String[] args) {
        // 운전자가 자동차를 고르기 위한 인스턴스 생성
        DriverConfig driverConfig = new DriverConfig();

        /*
         * 여러 운전자를 갖게 되는 리스트 인스턴스 생성
         * 하위 클래스는 상위 클래스의 의존을 해야함 이는 DIP 원칙을 지키는 뜻임
         * 만약 어떤 클래스가 추상적인 개념을 받는(상속, 구현) 클래스가 아니라면 무조건적으로 DIP를 고수할 필요는 없음
         * 아래 예시는 List라는 추상적인 개념을 ArrayList가 구현하였기 때문에 아래 처럼 사용함
         * List 인터페이스를 구현하는 클래스는 ArrayList이외에 LinkedList, Vector, Stack 등이 있음
         */
        List<Driver> drivers = new ArrayList<>();

        // 각 자동차의 운전자들을 생성
        Driver bmwDriver = driverConfig.bmwDriver();
        Driver genesisDriver = driverConfig.genesisDriver();
        Driver teslaDriver = driverConfig.teslaDriver();

        // 운전자들을 리스트에 추가
        drivers.add(bmwDriver);
        drivers.add(genesisDriver);
        drivers.add(teslaDriver);

        /*
         * forEach는 반복 가능한 객체에 대한 순회를 해주는 배열 메서드임
         * 인수로는 람다 형식을 받음
         * 람다 안에서 driver라는 매개변수가 있는데 driver가 move메서드와 stop메서드를 사용 가능함
         * 이유는 처음 drivers라는 리스트 인스턴스를 생성했을 때 제네릭 타입으로 Driver 타입을 사용했기 때문
         */
        drivers.forEach(driver -> {
            driver.move();
            driver.stop();
        });

        System.out.println();

        // 아래는 직접 테슬라 인스턴스를 생성하여 사용하는 예시임
        Car tesla = new Tesla();
        Driver driver = driverConfig.choiceCarToDrive(tesla);
        driver.move();
        driver.stop();
    }
}
