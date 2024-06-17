package ch16.sec01;

public class LambdaExample {
    // 파라미터의 type이 functional interface이므로 이 파라미터를 통해서 호출 가능한 메서드는 하나뿐.
    public static void action(Calculable calculable) {
        calculable.calculate(10, 4);
    }

    public static void main(String[] args) {
        // 람다가 없다면 이렇게 써야 함.
        CalculableImplPlus cp = new CalculableImplPlus();
        action(cp);

        CalculableImplMinus cm = new CalculableImplMinus();
        action(cm);

        // 1차 줄이기 시도 : anonymous 함수 만들기
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println(x-y);
            }
        });

        // 2차 줄이기 시도 : 람다
        action((x, y) -> System.out.println(x+y));


    }
}
