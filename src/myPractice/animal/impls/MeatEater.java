package myPractice.animal.impls;

import myPractice.animal.interfaces.Feed;

public class MeatEater implements Feed {

    @Override
    public String getFeeds() {
        return "meat";
    }
}
