package algorithm.chap02;

import algorithm.common.IntArrayGenerator;

import java.util.Random;

public class MaxOfArrayRand {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int num = IntArrayGenerator.setLength("heights");
        int[] heights = new int[num];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 100 + rd.nextInt(99);
            System.out.printf("heights[%d] = %d\n", i, heights[i]);
        }

        System.out.printf("최댓값은 %d입니다.", maxOf(heights));
    }
}
