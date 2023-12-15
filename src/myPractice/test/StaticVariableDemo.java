package myPractice.test;

class TestStaticVariable {
    static int staticNum;
    int num = 10;

    public void addNumWithStaticNum() {
        if (staticNum == 0) {
            System.out.println("값을 초기화 후 사용하세요!");

        } else {
            System.out.println(staticNum + num);
        }
    }

    public void whatIsStaticNum() {
        if (staticNum == 0) {
            System.out.println("값을 초기화 후 사용하세요!");

        } else {
            System.out.println(staticNum);
        }
    }

    public void whatIsNum() {
        System.out.println(this.num);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        TestStaticVariable tsv = new TestStaticVariable();

        tsv.whatIsStaticNum();

        TestStaticVariable.staticNum = 5;   // 클레스를 직접 사용하여 클레스 변수(static fields)를 5로 변경하였다.

        tsv.whatIsStaticNum();    // 클레스 본문에서 초기화를 하지않았지만 위처럼 클레스 변수를 초기화 하면 모든 인스턴스에 영향을 준다.
        tsv.addNumWithStaticNum();

        tsv.num = 15;    // sc인스턴스의 num 필드를 15로 설정하였다.

        TestStaticVariable tsv2 = new TestStaticVariable();
        tsv2.whatIsNum();    // sc인스턴스의 15로 설정된 num 필드는 sc2인스턴스에 전혀 영향을 끼치지 않는다.
        tsv2.whatIsStaticNum();
    }

}
