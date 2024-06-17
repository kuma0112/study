package ch13.sec03.ex01;

public class GenericExample {
    // static generic method
    public static <T>  Box<T> boxing (T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        System.out.println(box1.get());

        Box<String> box2 = boxing("홍길동");
        System.out.println(box2.get());
    }
}
