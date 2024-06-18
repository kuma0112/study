package ch16.sec05.ex01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(((x, y) -> Computer.staticMethod(x,y)));
        // 위 아래 같은 말. functional interface가 하는 일이 없고, person에서 받은 인자인 x와 y를 다른 곳으로 전달하기만 할 때, 이렇게 사용한다.
        person.action((Computer::staticMethod));

        Computer computer = new Computer();
        person.action(computer::instanceMethod);
        person.action(((x, y) -> computer.instanceMethod(x,y)));
    }
}
