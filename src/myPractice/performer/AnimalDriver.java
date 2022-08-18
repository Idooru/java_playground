package myPractice.performer;

import myPractice.Models.Animal;

import java.util.ArrayList;

public class AnimalDriver {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        String[] names = {"사자", "토끼", "거북이", "강아지"};


        for (String name : names) {
            animals.add(new Animal(name));
            System.out.println(animals);
        }
    }
}
