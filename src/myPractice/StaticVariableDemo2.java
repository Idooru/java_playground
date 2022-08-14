package myPractice;

class Mouse {
    public String name;
    public int age;
    public static int countOfTail;

    public void sing() {
        System.out.println(this.name + "찍찍!!!");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", countOfTail=" + countOfTail +
                '}';
    }
}

public class StaticVariableDemo2 {
    public static void main(String[] args) {
        Mouse.countOfTail = 1;

        Mouse micky = new Mouse();

        System.out.println(micky);

        Mouse.countOfTail = 2;

        Mouse monstRat = new Mouse();

        System.out.println(monstRat);
    }
}
