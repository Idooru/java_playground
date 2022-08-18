package myPractice.Models;

public class Mouse {
    public String name;
    public int age;
    public static int countOfTail;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
