package myPractice.animal.subs;

import myPractice.animal.abs.Animal;
import myPractice.animal.interfaces.Feed;

public class Predator extends Animal {

    public Predator(String name, Feed feed) {
        super(name, feed);
    }

    @Override
    public void eat() {
        System.out.printf("육식동물인 %s이(가) %s를 먹습니다. \n", name, feed.getFeeds());
    }

    public void howl(String sound) {
        System.out.println(sound);
    }
}
