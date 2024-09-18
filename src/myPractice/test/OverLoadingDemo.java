package myPractice.test;

public class OverLoadingDemo {
    /* 오버로딩의 조건으로 리턴값과 매개변수의 타입, 개수등은 서로 일치하지 않아도 된다.
        단 메서드의 이름은 같아야 한다.
    */
    public static void search(String One) {
        System.out.println("Searching One...");
        System.out.println("Not found");
    }

    public static boolean search(String One, String two) {
        System.out.println("Searching Two...");
        System.out.println("find 1!");
        return true;
    }

    public static int search(String one, String two, int three) {
        System.out.println("Searching Three...");
        System.out.println("find" + three + "!");
        return 5;
    }

    public static void main(String[] args) {
        search("idooru");
        boolean result1 = search("idooru", "java");
        int result2 = search("kimdooru", "java", 236);

        System.out.println("find1 : " + result1);
        System.out.println("find2 : " + result2);
    }
}
