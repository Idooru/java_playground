package algorithm.chap01;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("양의 정수 n의 값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int nLength = Integer.toString(n).length();
        System.out.printf("그 수는 %d자리입니다.", nLength);
    }
}
