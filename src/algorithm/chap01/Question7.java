package algorithm.chap01;

import algorithm.common.InputNumber;

public class Question7 {
    public static void main(String[] args) {
        int n = InputNumber.input("n");

        int nPlusOne= n + 1;
        int half = nPlusOne / 2;
        int sum = nPlusOne * half;

        System.out.println("sum = " + sum);
    }
}
