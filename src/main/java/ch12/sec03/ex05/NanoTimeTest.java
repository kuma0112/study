package ch12.sec03.ex05;

import java.util.Iterator;

public class NanoTimeTest {
    public static void main(String[] args) {
        // 수행 시간 비교 테스트 시작
        long time1 = System.nanoTime();

        // 수행 코드
        int sum = 0;
        for (int i = 0; i<100000000; i++ ) {
            sum += i;
        }

        // 수행 시간 비교 테스트 끝
        long time2 = System.nanoTime();
        System.out.println("nano time 기준 소요 시간 : " + (time2 - time1));



    }
}
