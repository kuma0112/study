package ch16.practice;

public class Person {
    public void action(Studyable studyable) {
        String result =  studyable.study("홍길동", "수학");
        System.out.println(result);
    }
}
