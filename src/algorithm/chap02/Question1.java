package algorithm.chap02;

import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        Random rd = new Random();

        int num = 1 + rd.nextInt(10);
        System.out.printf("사람수는 %d입니다.\n", num);
        int[] heights = new int[num];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 100 + rd.nextInt(99);
            System.out.printf("heights[%d] = %d\n", i, heights[i]);
        }

        System.out.printf("최댓값은 %d입니다.", MaxOfArrayRand.maxOf(heights));
    }
}
