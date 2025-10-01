package algorithm.chap01;

import algorithm.common.InputNumber;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        int n = InputNumber.inputPositiveInt("n");
        int w;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("w값: ");
            w = scanner.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }
    }
}
