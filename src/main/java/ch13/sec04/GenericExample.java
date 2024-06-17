package ch13.sec04;

public class GenericExample {
    // Number 포함 Number 클래스를 상속받은 하위 클래스만 오도록 제한
    public static <T extends Number> boolean compare (T t1, T t2) {
        return t1.doubleValue() == t2.doubleValue();
    }
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare(2039482019, 2039482019));
//        System.out.println(compare("hello", "hello")); // 안 된다
    }
}
