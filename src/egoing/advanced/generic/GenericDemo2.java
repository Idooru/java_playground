package egoing.advanced.generic;

class StudentInfo {
    public int grade;

    public StudentInfo(int grade) {
        this.grade = grade;
    }

}

class EmployeeInfo2 {
    public int rank;

    public EmployeeInfo2(int rank) {
        this.rank = rank;
    }
}

class Person2<T> {
    public T info;

    public Person2(T info) {
        this.info = info;
    }
}


public class GenericDemo2 {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(3);
        Person2<StudentInfo> sp = new Person2<StudentInfo>(si);
        System.out.println(sp.info.grade);

        EmployeeInfo2 ei = new EmployeeInfo2(1);
        Person2<EmployeeInfo2> ep = new Person2<EmployeeInfo2>(ei);
        System.out.println(ep.info.rank);
    }

}
