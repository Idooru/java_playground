package algorithm.chap01;

import algorithm.common.InputNumber;

public class Alternative2 {
    public static void main(String[] args) {
        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        int n = InputNumber.inputPositiveInt("n");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            output.append("+-");
        }

        if (n % 2 != 0) output.append("+");
        System.out.println(output);
    }
}
