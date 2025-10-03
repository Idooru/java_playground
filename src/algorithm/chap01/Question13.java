package algorithm.chap01;

import algorithm.common.InputNumber;

public class Question13 {
    public static void main(String[] args) {
        System.out.println("정사각형을 출력합니다.");

        StringBuilder sb = new StringBuilder();
        int n = InputNumber.inputPositiveInt("n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
