package myPractice.performer;

import myPractice.Models.Mouse;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse.countOfTail = 1;

        Mouse micky = new Mouse("미키", 87);
        System.out.println(micky);
        micky.sing();

        Mouse jerry = new Mouse("제리", 73);
        System.out.println(jerry);
        jerry.sing();

        Mouse.countOfTail = 0;
        Mouse monstRat = new Mouse("괴물쥐", 28);
        System.out.println(monstRat);
    }
}
