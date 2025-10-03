package algorithm.chap01;

public class Question12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int start = 1;
        int end = 9;

        sb.append("   | ");
        for (int i = start; i <= end; i++) {
            sb.append(String.format("%-3d", i));
        }

        sb.append(String.format("\n%s+%s\n", "-".repeat(3), "-".repeat(27)));

        for (int i = start; i <= end; i++) {
            sb.append(String.format(" %d | ", i));
            for (int j = start; j <= end; j++) {
                sb.append(String.format("%-3d", i + j));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
