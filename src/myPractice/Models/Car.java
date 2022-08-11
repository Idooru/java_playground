package myPractice.Models;

public class Car {
    String color;
    int doors;

    public Car() {
        this("red", 4);
    }

    public Car(String color, int doors) {
        this.color = color;
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' + ", doors=" + doors + '}';
    }
}
