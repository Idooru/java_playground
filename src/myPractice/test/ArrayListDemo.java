package myPractice.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] namesArray = {"Idooru", "KimDooru", "ParkDooru"};
        System.out.println(namesArray);
//        namesArray[3] = "ChoiDooru"; 배열의 길이 제한으로 더 이상의 추가가 불가능하다.
//        System.out.println(namesArray);

        List<String> namesList = List.of(namesArray);
        System.out.println(namesList);
//        namesList.add("ChoiDoorui"); UnsupportedOperationException
//        System.out.println(namesList);

        ArrayList<String> namesArrayList = new ArrayList<String>(List.of(namesArray));
        System.out.println(namesArrayList);
        namesArrayList.add("ChoiDooru");
        System.out.println(namesArrayList);
    }
}
