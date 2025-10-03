package algorithm.common;

import java.util.Scanner;

public class IntArrayGenerator {
    private final static Scanner scanner = new Scanner(System.in);

    public static int setLength(String varName) {
        int length;
        do {
            System.out.printf("%s길이: ", varName);
            length = scanner.nextInt();
        } while(length <= 0);
        return length;
    }

    public static int[] generateArr(String varName) {
        int num = setLength(varName);
        int[] ints = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("%s[%d] = ", varName, i);
            ints[i] = scanner.nextInt();
        }

        return ints;
    }
}
