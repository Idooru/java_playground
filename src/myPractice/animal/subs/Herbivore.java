package myPractice.animal.subs;

import myPractice.animal.abs.Animal;
import myPractice.animal.interfaces.Feed;

public class Herbivore extends Animal {


    public Herbivore(String name, Feed feed) {
        super(name, feed);
    }

    @Override
    public void eat() {
        System.out.printf("초식동물인 %s이(가) %s를 먹습니다. \n", name, feed.getFeeds());
    }

    public void cry(String sound) {
        System.out.println(sound);
    }
}
