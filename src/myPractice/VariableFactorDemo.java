package myPractice;

import java.util.Arrays;

public class VariableFactorDemo {
    /*
    * 만약 리턴값과 매개변수의 타입이 같고 매개변수의 개수를 가변적으로 받는다고 가정할 때
    * 아래처럼 오버로딩이 필요없이 ...을 사용하여 매개변수의 개수를 자유롭게 받을 수 있다.
    * */
    public static void inputNumbers(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        inputNumbers(1, 2);
        inputNumbers(1, 2, 3);
        inputNumbers(1, 2, 3, 4);
        inputNumbers(1, 2, 3, 4, 5);
    }
}
