package algorithm.chap01;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a값: ");
        a = scanner.nextInt();

        do {
            System.out.print("b값: ");
            b = scanner.nextInt();
            if (a >= b) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        } while (a >= b);

        System.out.printf("b - a는 %d입니다.", b - a);
    }
}
