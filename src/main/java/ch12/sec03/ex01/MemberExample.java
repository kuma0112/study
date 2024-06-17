package ch12.sec03.ex01;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        // sout -> 객체.toString()을 호출
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        /*
        ch12.sec03.ex01.Member@251a69d7
        ch12.sec03.ex01.Member@7344699f
        ch12.sec03.ex01.Member@6b95977
         */

        /*
        equals()는 Object의 equals()를 상속하며,
        Object의 equals()는 ==을 사용한다.
         */
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
