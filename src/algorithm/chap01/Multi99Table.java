package algorithm.chap01;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("  " + "-".repeat(7) + " 구구단 곱셈표 " + "-".repeat(7));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                sb.append(String.format("%3d", i * j));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
