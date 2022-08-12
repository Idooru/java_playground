package egoing.advanced.generic;

interface Info {
    int getLevel();
}

class EmployeeInfo4 implements Info {
    public int rank;

    EmployeeInfo4(int rank) {
        this.rank = rank;
    }

    public int getLevel() {
        return this.rank;
    }
}

class Person4<T extends Info> {
    public T info;

    public Person4(T info) {
        this.info = info;
        info.getLevel();
    }

}

public class GenericDemo4 {
    public static void main(String[] args) {
        EmployeeInfo4 e1 = new EmployeeInfo4(5);
        Person4<EmployeeInfo4> p1 = new Person4<EmployeeInfo4>(new EmployeeInfo4(1));

        System.out.println(e1.getLevel());
//        Person4<String> p2 = new Person4<String>("부장");
    }
}
