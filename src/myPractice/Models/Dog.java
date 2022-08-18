package myPractice.Models;

public class Dog {
    final static Boolean male = true;
    final static Boolean female = false;
    public static Boolean gender;

    public static void pee() {
        if (gender.equals(male)) {
            System.out.println("다리 벌리고 오줌싸기");
        } else {
            System.out.println("쪼그려서 오줌싸기");
        }
    }
}
