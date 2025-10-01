package algorithm.chap01;

import algorithm.common.InputNumber;

public class Question10 {
    public static void main(String[] args) {
        int n = InputNumber.inputPositiveInt("n");

        int nLength = Integer.toString(n).length();
        System.out.printf("그 수는 %d자리입니다.", nLength);
    }
}
