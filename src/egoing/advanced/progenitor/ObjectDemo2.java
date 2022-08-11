package egoing.advanced.progenitor;

import java.util.Objects;

class Student2 implements Cloneable {
    String name;

    public Student2(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ObjectDemo2 {

    public static void main(String[] args) {
        Student2 s2 = null;
        Student2 s1 = new Student2("egoing");

        try {
            s2 = (Student2) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        System.out.println(s1.name);
        System.out.println(Objects.requireNonNull(s2).name);

    }

}
