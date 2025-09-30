package algorithm.chap01;

import algorithm.common.InputNumber;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        int n = InputNumber.input("n");

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.printf("1부터 %d까지의 합은 %d입니다.\n", n, sum);
    }
}
