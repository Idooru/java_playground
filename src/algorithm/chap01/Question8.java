package algorithm.chap01;

import algorithm.common.InputNumber;

public class Question8 {
    static int sumOf(int a, int b) {
        if (a > b) {
            int swap = a;
            a = b;
            b = swap;
        }
    
        int sum = 0;

        int i;
        for (i = a; i <= b; i++) {
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int a = InputNumber.input("a");
        int b = InputNumber.input("b");

        int sum = sumOf(a, b);
        System.out.println("sum = " + sum);
    }
}
