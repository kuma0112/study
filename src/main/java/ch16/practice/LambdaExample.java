package ch16.practice;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((name, subject) -> name + "이 " + subject + "를 공부합니다.");
    }
}
