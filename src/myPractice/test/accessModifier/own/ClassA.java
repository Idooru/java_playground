package myPractice.test.accessModifier.own;

public class ClassA {
    static private final String priOnA = "private varaible";
    static protected String proOnA = "protected variable";
    static public String pubOnA = "public variable";
    static String defOnA = "default variable";

    public static void main(String[] args) {
        System.out.println(ClassA.priOnA);
        System.out.println(ClassA.proOnA);
        System.out.println(ClassA.pubOnA);
        System.out.println(ClassA.defOnA);
    }

    /*
     * 모든 변수를 사용할 수 있다.
     * 자기 자신의 클래스 내에서 사용하기 때문에 private를 포함한
     * 모든 변수를 사용할 수 있다.
     */
}
