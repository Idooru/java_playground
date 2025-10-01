package algorithm.chap01;

import algorithm.common.InputNumber;

public class SumVerbose2 {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");

        int n = InputNumber.inputPositiveInt("n");
        int sum = 0;
        StringBuilder output = new StringBuilder();

        for (int i = 1; i < n; i++) {
            sum += i;
            output.append(String.format("%d + ", i));
        }

        sum += n;
        output.append(String.format("%d = ", n));
        output.append(sum);
        System.out.println(output);
    }
}
