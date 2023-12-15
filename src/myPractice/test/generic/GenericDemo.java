package myPractice.test.generic;

import java.util.ArrayList;

abstract class Animal {
    abstract public void breath();
}

interface walkable {
    void walk();
}

interface flyable {
    void fly();
}

class Dog extends Animal implements walkable {


    @Override
    public void walk() {
        System.out.println("강아지처럼 걷기");
    }

    @Override
    public void breath() {
        System.out.println("숨쉬기");
    }
}

class Cat extends Animal implements walkable {
    @Override
    public void walk() {
        System.out.println("고양이처럼 걷기");
    }

    @Override
    public void breath() {
        System.out.println("숨쉬기");
    }
}

class Sparrow extends Animal implements flyable {
    @Override
    public void fly() {
        System.out.println("참새처럼 날기");
    }

    @Override
    public void breath() {
        System.out.println("숨쉬기");
    }
}

class Pigeon extends Animal implements flyable {
    @Override
    public void fly() {
        System.out.println("비둘기처럼 날기");
    }

    @Override
    public void breath() {
        System.out.println("숨쉬기");
    }
}

class AnimalList<T> {
    ArrayList<T> al = new ArrayList<T>();

    void add(T animal) {
        al.add(animal);
    }

    T get(int index) {
        return al.get(index);
    }

    boolean remove(T animal) {
        return al.remove(animal);
    }

    int size() {
        return al.size();
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        AnimalList<walkable> landAnimal = new AnimalList<>();
        aboutLandAnimal(landAnimal);

        AnimalList<flyable> skyAnimal = new AnimalList<>();
        aboutFlyAnimal(skyAnimal);

    }

    public static void aboutLandAnimal(AnimalList<walkable> landAnimal) {
        landAnimal.add(new Dog());
        landAnimal.add(new Cat());

        for (int i = 0; i < landAnimal.size(); i++) {
            landAnimal.get(i).walk();
        }
    }

    public static void aboutFlyAnimal(AnimalList<flyable> skyAnimal) {
        skyAnimal.add(new Sparrow());
        skyAnimal.add(new Pigeon());

        for (int i = 0; i < skyAnimal.size(); i++) {
            skyAnimal.get(i).fly();
        }
    }
}
