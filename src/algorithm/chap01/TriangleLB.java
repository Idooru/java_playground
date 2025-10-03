package algorithm.chap01;

import algorithm.common.InputNumber;

public class TriangleLB {
    public static void main(String[] args) {
        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        StringBuilder sb = new StringBuilder();
        int n = InputNumber.inputPositiveInt("n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
