package myPractice.test;

class Dog {
    final static Boolean male = true;
    final static Boolean female = false;
    static Boolean gender;

    static void pee() {
        if (gender.equals(male)) {
            System.out.println("다리 벌리고 오줌싸기");
        } else {
            System.out.println("쪼그려서 오줌싸기");
        }
    }
}


public class DogDemo {
    public static void main(String[] args) {
        Dog.gender = false;
        Dog.pee();
    }
}
