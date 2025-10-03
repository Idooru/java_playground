package algorithm.chap01;

public class Question16 {
    static void npira(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append(String.valueOf(i).repeat(i * 2 + 1));
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        int n = 4;

        npira(n);
    }
}
