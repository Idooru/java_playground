package algorithm.chap01;

public class Question14 {
    static final StringBuilder sb = new StringBuilder();

    static void log() {
        System.out.println(sb);
        sb.setLength(0);
    }

    static void triangleLB(int n) {
        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력");

        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i));
            sb.append("\n");
        }

        log();
    }

    static void triangleLU(int n) {
        System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력");

        for (int i = n; i >= 1; i--) {
            sb.append("*".repeat(i));
            sb.append("\n");
        }

        log();
    }

    static void triangleRU(int n) {
        System.out.println("오른쪽 위가 직각인 이등변삼각형을 출력");

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(i)).append("*".repeat(n - i));     // 별 출력
            sb.append("\n");
        }

        log();
    }

    static void triangleRB(int n) {
        System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력");

        for (int i = n - 1; i >= 0; i--) {
            sb.append(" ".repeat(i)).append("*".repeat(n - i));
            sb.append("\n");
        }

        log();
    }

    public static void main(String[] args) {
        int n = 5;

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }
}
