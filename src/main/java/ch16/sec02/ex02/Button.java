package ch16.sec02.ex02;

public class Button {

    // 버튼 내부의 인터페이스. 이 버튼 안에서만 쓰겠다는 뜻.
    @FunctionalInterface
    public static interface ClickListener {
        void onClick(); // public abstract 생략됨
    }

    // 필드
    private ClickListener clickListener;

    // 메서드
    public void setClieckListner(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // 이 버튼이 클릭되면 호출되는 메서드
    // 클릭되었을 대 수행하는 코드는 functional interface의 메서드를 호출
    // <= functional interface의 구현체는 외부에서 람다로 받겠다.
    // 클라이언트 쪽에서 람다를 활용하여 훨씬 유연한 활용이 가능함.
    public void click() {
        this.clickListener.onClick();
    }

    // 바깥에서 구현된 클릭리스너를 받아서 내부의 함수형 인터페이스를 통과해 onClick() 하도록 하는 모양새


    // Button이 클릭되었을 때 실제 수행되는 코드는 이곳에 없다.
    // 수행되는 코드는 객체가 만들어지는 시점에 람다로 선언된다.
}
