package myPractice.test;

class Parents {
    protected String who = "부모님";
    protected String pack = "잡동사니";
}

class Child extends Parents {

    public String sonsParents() {
        return super.who;
    }
    public String getParentsPack() {
        return super.pack;
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Child son = new Child();

        System.out.println(son.sonsParents() + "에게 " + son.getParentsPack() + "를 받았습니다!");
    }
}
