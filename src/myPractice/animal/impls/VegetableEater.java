package myPractice.animal.impls;

import myPractice.animal.interfaces.Feed;

public class VegetableEater implements Feed {

    @Override
    public String getFeeds() {
        return "vegetable";
    }
}
