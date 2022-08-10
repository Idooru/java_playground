package egoing.objectoriented.classinstance;

class C1 {
    static int static_variable = 1;
    int instance_variable = 2;

    static void static_static() {
        System.out.println(static_variable);
    }

    static void static_instance() {
        // 스테틱 메서드에서는 인스턴스 변수에 접근이 불가능하다.
        // System.out.println(instance_variable);
    }

    void instance_static() {
        System.out.println(static_variable);
    }

    void instance_instance() {
        System.out.println(instance_variable);
    }
}

public class ClassMemberDemo {
    public static void main(String[] args) {
        C1 c1 = new C1();

//        c1.static_static();
//        c1.static_instance(); // 접근은 가능하지만 스테틱 메서드에서 인스턴스 변수를 호출하는것은 불가능하다.
//        c1.instance_static();
//        c1.instance_instance();
//
//        C1.static_static();
//        C1.static_instance();
//        C1.instance_static();
//        C1.instance_instance();
        /* 인스턴스를 생성하지 않고 클레스에서 인스턴스 메서드에 접근하는것은 불가능하다.
            말 그대로 인스턴스 메서드라서 인스턴스를 생성하지 않고는 접근이 불가능하다.
        * */
    }
}


