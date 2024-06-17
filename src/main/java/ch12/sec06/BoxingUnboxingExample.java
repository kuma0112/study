package ch12.sec06;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // boxing
        Integer obj = 100; // 리터럴 100 넣어도 자동 박싱
        System.out.println(obj);
        System.out.println(obj.intValue());

        // unboxing
        int value = obj; // 객체 넣어도 int로 자동 언박싱
        int value2 = obj.intValue(); // 예전에는 꼭 .intValue()로 언박싱 해줬어야.
        System.out.println(value);
        System.out.println(value2);

        int result = obj + 100; // 객체랑 정수 더하기할 때 자동 언박싱
        System.out.println(result);
    }
}
