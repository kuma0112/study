package ch12.sec03.ex02;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student() {}
    public Student(int no, String name) {}

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(name, student.name);
    }

    // Collections API를 올바르게 사용하기 위해서는
    // 꼭 override 해 주자!
    @Override
    public int hashCode() {
//        return no + name.hashCode(); // 이렇게 오버라이딩 할 수도 있겠지만
        return Objects.hash(no, name); // 만들어 주는 이것을 쓰는 게 좋음
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
