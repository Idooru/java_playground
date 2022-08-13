package egoing.advanced.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SetDemo3 {
    public static void main(String[] args) {
        Collection<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        Iterator<Integer> hi = A.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }
    }
}
