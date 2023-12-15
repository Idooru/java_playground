package myPractice.oop1;

// 운전자 클래스의 DI(Dependency Injection) Container
public class DriverConfig {

    // 매개변수를 통해서 외부에서 원하는 자동차 타입의 인스턴스를 주입함
    public Driver choiceCarToDrive(Car car) {
        return new Driver(car);
    }

    // 비엠더블유 인스턴스를 주입함
    public Driver bmwDriver() {
        return new Driver(new BMW());
    }

    // 제네시스 인스턴스를 주입함
    public Driver genesisDriver() {
        return new Driver(new Genesis());
    }

    // 테슬라 인스턴스를 주입함
    public Driver teslaDriver() {
        return new Driver(new Tesla());
    }
}
