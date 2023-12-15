package myPractice.test.generic;


class GenericTest<T, V> {
    public T data1;
    public V data2;

    GenericTest(T data1, V data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public V getData2() {
        return data2;
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        final GenericTest<String, Integer> stringAndIntegerType = new GenericTest<>("Hello", 123);
        final GenericTest<Boolean, Double> booleanAndDoubleType = new GenericTest<>(true, 123.123);

        System.out.println(stringAndIntegerType.getData1());
        System.out.println(stringAndIntegerType.getData2());

        System.out.println(booleanAndDoubleType.getData1());
        System.out.println(booleanAndDoubleType.getData2());
    }
}
