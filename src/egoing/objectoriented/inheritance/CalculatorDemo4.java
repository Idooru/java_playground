package egoing.objectoriented.inheritance;

class SuperCalculator {
    int left, right;

    public SuperCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }


}

class SubStractionableCalculator2 extends SuperCalculator {
    SubStractionableCalculator2(int left, int right) {
        super(left, right);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo4 {

    public static void main(String[] args) {
        SubStractionableCalculator2 c1 = new SubStractionableCalculator2(10, 20);
        c1.substract();
    }
}
