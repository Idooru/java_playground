package algorithm.chap01;

import algorithm.common.InputNumber;

public class SumFor {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        int n = InputNumber.input("n");
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.printf("1부터 %d까지의 합은 %d입니다.\n", n, sum);
    }
}
