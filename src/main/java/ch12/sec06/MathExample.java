package ch12.sec06;

public class MathExample {
    public static void main(String[] args) {
        int y1 = 100;
        int x1 = 20;

        int y2 = 50;
        int x2 = 100;

        int distance = Math.abs(y2-y1) + Math.abs(x2-x1);
        System.out.println(distance);
    }
}
