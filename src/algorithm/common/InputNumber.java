package algorithm.common;

import java.util.Scanner;

public class InputNumber {
    public static int input(String varName) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s값: ", varName);
        return scanner.nextInt();
    }
}
