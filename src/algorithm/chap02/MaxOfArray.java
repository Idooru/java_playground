package algorithm.chap02;

import algorithm.common.IntArrayGenerator;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = IntArrayGenerator.generateArr("heights");
        System.out.printf("최댓값은 %d입니다.", maxOf(heights));
    }
}
