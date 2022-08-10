package myPractice;

class Parents {
    String pack = "부모님의 잡동사니";
}

class Child extends Parents {
    public String getParentsPack() {
        return super.pack;
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Child son = new Child();

        System.out.println(son.getParentsPack() + "를 받았습니다!");
    }
}
