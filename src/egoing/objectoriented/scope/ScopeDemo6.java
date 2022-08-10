package egoing.objectoriented.scope;

class C {
    int v = 10;

    void m() {
        int v = 20;
        System.out.println(v);
        System.out.println(this.v);
    }
}

public class ScopeDemo6 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
