package ch13.sec02.ex03;

public class Box<T> {
    public T content;

    //  두 박스 객체의 비교를 위한 메서드
    public boolean compareBox(Box<T> other) {
        return this.content.equals(other.content);
    }
}
