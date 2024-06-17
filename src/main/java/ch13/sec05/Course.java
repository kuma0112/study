package ch13.sec05;

public class Course {
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind);
    }
    public static void registerCourse2(Applicant<? extends Student> applicant) {

    }
    public static void registerCourse3(Applicant<? super Worker> applicant) {

    }
}
