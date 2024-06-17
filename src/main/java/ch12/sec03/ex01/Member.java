package ch12.sec03.ex01;

import java.util.Objects;

public class Member extends Object{
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) { // 멤버 클래스인지 확인
            Member target = (Member) obj; // 확인하면 멤버로 형변환
//            if (this.id.equals(target.id)) { // 객체비교 로직. 상황에 맞게 바꾸기
//                return true;
//            }
            return Objects.equals(this.id, target.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (this == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Member other = (Member) obj;
//        return Objects.equals(id, other.id);
//    }
}
