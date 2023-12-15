package myPractice.test;

class Stone {
    final void retrain() {
        System.out.println("돌 재련중...");
    }
}

/*
 * Stone클래스의 retrain()메서드가 final로 정의되어 있어서
 * 메서드 오버라이딩이 불가능하다.
 */
//class Gargoyle extends Stone {
//    @Override
//    void retrain() {
//        System.out.println("석상 재련중...");
//    }
//}

public class FinalMethodDemo {
    public static void main(String[] args) {
    }
}
