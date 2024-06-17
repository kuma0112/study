package ch12.sec03.ex05;

import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {
        // 비효율적인 예시
        String result = "Hello" + "World" + "AAA";


//        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb = new StringBuilder();
        // 효율 + old style
//        sb.append("hello");
//        sb.append("world");
//        sb.append("aaa");

        // 효율 + new style + 메서드 체이닝
        sb.append("hello").append("world").append("jaaa");
        System.out.println(sb);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i<10; i++) {
            String str = " " + i;
            answer.append(str);
        }
        System.out.println(answer);


        // StringTokenizer
        String str = "일길동,이길동,삼길동";
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

        int N = 5;
        String input = "10 27 5 4 19";
        StringTokenizer st2 = new StringTokenizer(input);
        System.out.println(st2); // 이러면 그냥 st2의 해시값 출력됨

        // split보다 string tokenizer 사용함!
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st2.nextToken());
            System.out.println(num);
        }
    }
}
