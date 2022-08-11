package egoing.objectoriented.overloading;

class Calculator {
    int left, right;
    int third = 0;

    public void setOperands(int left, int right) {
        System.out.println("setOperands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right, int third) {
        this.setOperands(left, right);
        System.out.println("setOperands(int left, int right, int third)");
        this.third = third;
    }

    public void sum() {
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        if (this.third > 1) {
            System.out.println((this.left + this.right + this.third) / 3);
        } else {
            System.out.println((this.left + this.right) / 2);
        }
    }

}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOperands(10, 20 ,30);
        c1.sum();
        c1.avg();
    }
}
