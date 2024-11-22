package libPractice;

class Test {
}

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Test test = new Test();

        stringBuilder.append("test instance: ");
        stringBuilder.append(test);
        stringBuilder.append(" 입니다.");

        System.out.println(stringBuilder);
    }
} 