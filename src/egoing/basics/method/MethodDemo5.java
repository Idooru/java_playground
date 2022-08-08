package egoing.basics.method;

public class MethodDemo5 {
    public static void numbering(int init, int limit) {
        int i = init;

        while (i < limit) {
            System.out.println(i);
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        numbering(3,10);
        numbering(2, 6);
    }
}
