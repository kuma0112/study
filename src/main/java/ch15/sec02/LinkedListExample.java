package ch15.sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("Helllo");
//        list.add("World");
//        list.add("유레카");
//
//        String cur = list.get(1);
//        System.out.println(cur);

        // test arraylist vs linkedlist
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        long startTime;
        long endTime;

//        // arraylist
//        startTime = System.nanoTime();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(0, String.valueOf(i));
//        }
//        endTime = System.nanoTime();
//        System.out.println(endTime - startTime);
//
//        // linkedlist
//        startTime = System.nanoTime();
//        for (int i = 0; i< 100000; i++) {
//            linkedList.add(0, String.valueOf(i));
//        }
//        endTime = System.nanoTime();
//        System.out.println(endTime - startTime);
        // linkedlist가 더 빠르다

        // arraylist
        startTime = System.nanoTime();
        for (int i = 0; i < 300000; i++) {
            arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        // linkedlist
        startTime = System.nanoTime();
        for (int i = 0; i < 300000; i++) {
            linkedList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
    // arraylist가 더 빠르다.
    // 시간 비교 어려울 경우 충분히 큰 수로 시험해보기
}
