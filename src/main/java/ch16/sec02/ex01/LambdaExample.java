package ch16.sec02.ex01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(() -> {
            System.out.println("출근!");
            System.out.println("코딩!");
        });
    }
}
