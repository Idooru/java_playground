package egoing.objectoriented.inheritance;

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
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

class SubStractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubStractionableCalculator c1 = new SubStractionableCalculator();

        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}

