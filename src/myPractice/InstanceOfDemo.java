package myPractice;

class Animal {
}

class Cat extends Animal {
}

class Turtle extends Animal {
}

class Sunflower {
}

public class InstanceOfDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Turtle turtle = new Turtle();
        Sunflower sunflower = new Sunflower();

        System.out.println(animal instanceof Animal);
        System.out.println(cat instanceof Animal);
        System.out.println(turtle instanceof Animal);

//        System.out.println(sunflower instanceof Animal);
    }
}
