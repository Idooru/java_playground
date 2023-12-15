package myPractice.oop1;

public class Driver {

    /*
     * 아래 방법은 특정 클래스의 생성자를 직접 호출하여 필드를 초기화 함
     * 이로 인해서 운전자 클래스는 각 자동차 클래스에 의존을 하게 됨
     * 의존을 한다는 것은 A클래스가 B클래스의 자원을 요구하여 사용한다는 뜻임
     * A클래스는 B클래스가 없을 시 작동 할 수 없게 됨
     * 그리고 아래 방법은 해당 클래스가 자기 자신을 의존하게 됨
     * 하위 클래스는 상위 클래스의 의존을 해야함 ex) List<String> list = new ArrayList<>();
     * 이유는 상위 일수록 추상적인 개념이며 하위 일수록 구채적인 개념인데 구채적일수록 변화에 대응하기 어려워 지기 때문임
     */
//    private BMW bmw = new BMW();
//    private Genesis genesis = new Genesis();
//    private Tesla tesla = new Tesla();

    private final Car car;

    /*
     * 외부에서 인스턴스를 생성한 후 해당 클래스의 필드로써 사용이 가능
     * 이를 의존성 주입(Dependency Injection)이라고 함
     * 운전자 클래스는 더 이상 특정 자동차 클래스를 직접 생성해서 의존할 필요가 없어짐
     * Car는 인터페이스로서 추상화 된 개념임
     * 비엠더블유, 테슬라, 제네시스는 구채적인 개념임
     * 만일 운전자가 테슬라 타입만을 매개변수로 받게 되면 그 운전자는 더이상 비엠더블유, 제네시스는 사용 못하게 됨
     * 이 개념들을 Car로 묶음으로써 유연하게 자동차들을 사용할 수 있게 됨
     * 여기서 OCP개념이 발현되는데 위에서 주석된 코드처럼 직접 기능이 추가될 때 코드가 추가(변경)되는 형식이 아니라
     * 코드 변경 없이 기능을 추가 할 수 있는 상태가 됨 이것이 OCP!
     * 이는 변화에 대응하기 유연하게 된다고 볼 수 있음
     * 인터페이스만 잘 활용할 수 있으면 객체지향을 이해하기 수월함
     */
    public Driver(Car car) {
        this.car = car;
    }

    public void move() {
        car.move();
    }

    public void stop() {
        car.stop();
    }
}
