package ch12.sec03.ex02;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(10, "홍길동");
        Student s2 = new Student();
        s2.setNo(20);
        s2.setName("이길동");

        // toString으로 클래스명@해시코드 출력됨
        // Student 클래스에서 toString 오버라이딩하면
        /*
        이렇게 출력됨
        Student{no=0, name='null'}
        Student{no=20, name='이길동'}
         */
        System.out.println(s1);
        System.out.println(s2);
    }
}
