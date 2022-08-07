package egoing.basics.condition;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("switch(1)");

        switch (1) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
