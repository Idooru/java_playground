package egoing.advanced.collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
//        arrayObj[2] = "three";
        for (String arrayObj1 : arrayObj) {
            System.out.println(arrayObj1);
        }

        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");

        for (int i = 0; i < al.size(); i++) {
            String value = al.get(i);
            System.out.println(value);
        }

    }
}
