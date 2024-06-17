package ch13.sec05;

public class GenericExample {
    public static void main(String[] args) {
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

//        Course.registerCourse2(new Applicant<Person>(new Person())); //  Student 를 extends 하지 않아서 오류남
//        Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        Course.registerCourse3(new Applicant<Person>(new Person())); //  Wokrer의 super가 아니라서 오류남
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//        Course.registerCourse3(new Applicant<Student>(new Student()));
//        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
