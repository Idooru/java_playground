package egoing.objectoriented.object;

class Calculaotor {
    private int left, right;

    public void setOperand(int left, int right) {
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

public class CalculatorDemo4 {
    public static void main(String[] args) {
        Calculaotor c1 = new Calculaotor();
        c1.setOperand(10, 20);
        c1.sum();
        c1.avg();

        Calculaotor c2 = new Calculaotor();
        c2.setOperand(20, 40);
        c2.sum();
        c2.avg();
    }
}