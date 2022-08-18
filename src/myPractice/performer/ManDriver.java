package myPractice.performer;

import myPractice.Models.Man;

public class ManDriver {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man("Idooru", 25);

        System.out.println(man1);
        System.out.println(man2);
    }
}
