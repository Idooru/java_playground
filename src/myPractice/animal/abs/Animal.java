package myPractice.animal.abs;

import myPractice.animal.interfaces.Feed;

public abstract class Animal {

    protected final String name;
    protected final Feed feed;

    protected Animal(String name, Feed feed) {
        this.name = name;
        this.feed = feed;
    }

    public abstract void eat();

}
