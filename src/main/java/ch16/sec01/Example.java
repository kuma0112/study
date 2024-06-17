package ch16.sec01;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);

        System.out.println(list.size());

        int[] numbers = new int[10];
        System.out.println(numbers.length);
    }
}
