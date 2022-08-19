package myPractice;

class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void Feed() {
        System.out.println(this.name + " 밥먹이기");
    }
}

class MyPet extends Dog {

    public MyPet(String name) {
        super(name);
    }

    @Override
    public void Feed() {
        System.out.println("우리 " + super.name + "(이) 밥먹으렴~");
    }
}

public class OverRidingDemo {
    public static void main(String[] args) {
        // 상위 클래스의 객체 참조 변수를 사용하더라도 하위 클레스에서 오버라이딩한 메서드가 호출된다.
        Dog dog1 = new Dog("땡");
        dog1.Feed();

        MyPet dog2 = new MyPet("몽");
        dog2.Feed();

        Dog dog3 = new Dog("dingo");
        dog3.Feed();
    }
}
