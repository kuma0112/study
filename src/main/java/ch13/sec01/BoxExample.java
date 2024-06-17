package ch13.sec01;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
                // Box<String>이라고 <T>에 어떤 타입이 들어가는지 명시하면
        // 컴파일러는 T를 String으로 타입 변환하는 일을 한다.
        box.content = "hello";

        Box<Integer> box2 = new Box<>();
        box2.content = 3;
    }
}
