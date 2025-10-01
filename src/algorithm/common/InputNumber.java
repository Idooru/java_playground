package algorithm.common;

import java.util.Scanner;

public class InputNumber {
    private final static Scanner scanner = new Scanner(System.in);

    public static int input(String varName) {
        System.out.printf("%s값: ", varName);
        return scanner.nextInt();
    }

    public static int inputPositiveInt(String varName) {
        int n;
        do {
            System.out.printf("%s값: ", varName);
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
}
