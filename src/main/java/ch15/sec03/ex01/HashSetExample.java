package ch15.sec03.ex01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Java");
//        set.add("Java");
//        set.add("Java");
//        set.add("Java");
//        set.add("유레카");
//        set.add("백엔드");
//
//        System.out.println(set.size()); // 3
//        for (String string : set) {
//            System.out.println(string); // Java, 백엔드, 유레카 -> 순서 보장 안 된다는 걸 알 수 있음
//        }
        Set<Member> set = new HashSet<>();
        set.add(new Member("홍길동", 25));
        set.add(new Member("홍길동", 25));
        set.add(new Member("이길동", 25));
        System.out.println(set.size());
        for (Member member : set) {
            System.out.println(member);
        }
        /*
        ch15.sec03.ex01.Member@7344699f
        ch15.sec03.ex01.Member@251a69d7
        ch15.sec03.ex01.Member@6b95977
         */
        // new로 새로 만들어서 넣기 때문에 다른 객체라고 인식함. equals() 오버라이딩하기 전.
        // hashCode와 equals를 오버라이딩하면 같은 객체로 인식함.

        // 아래처럼 새로운 멤버를 만들어서 바로 지우는 걸 해보자,
        // 홍길동 25가 원래 set에 들어 있었따면 이것도 함께 지워진다.
        // 즉 사이즈는 1이 나온다.
        set.remove(new Member("홍길동", 25));
        System.out.println(set.size());
    }
}
