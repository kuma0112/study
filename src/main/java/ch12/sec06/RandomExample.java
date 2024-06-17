package ch12.sec06;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 1. Math.random() 0.0 <= ? <= 1.0
        // 이렇게 나온 소숫점에서 값을 곱해야 하는 귀찮은 일 발생

        // so, there is Random class.
        // parameter is called 'seed'
        // the seed is used to make random number. kind of ingredient.
        Random random = new Random(3);
        for (int i = 0; i < 10 ; i++) {
            int n = random.nextInt(6);
            System.out.println(n+1);
        }
    }
}
