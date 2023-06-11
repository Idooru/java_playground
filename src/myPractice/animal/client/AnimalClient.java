package myPractice.animal.client;

import myPractice.animal.abs.Animal;
import myPractice.animal.impls.MeatEater;
import myPractice.animal.impls.VegetableEater;
import myPractice.animal.subs.Herbivore;
import myPractice.animal.subs.Predator;

public class AnimalClient {
    public static void main(String[] args) {
        Animal lion = new Predator("사자", new MeatEater());
        lion.eat();

        Predator predatorLion = (Predator) lion;
        predatorLion.howl("Grrrrng!!");

        Animal rabbit = new Herbivore("토끼", new VegetableEater());
        rabbit.eat();

        Herbivore herbivoreRabbit = (Herbivore) rabbit;
        herbivoreRabbit.cry("Gging Gging");

    }
}
