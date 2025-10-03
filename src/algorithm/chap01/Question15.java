package algorithm.chap01;

public class Question15 {
    static void spira(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(i * 2 + 1));
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        int n = 4;

        spira(n);
    }
}
