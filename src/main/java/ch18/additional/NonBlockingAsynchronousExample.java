package ch18.additional;

import java.util.concurrent.CompletableFuture;

public class NonBlockingAsynchronousExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            // 긴 작업 수행
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result from long running task";
        }).thenAccept(result -> {
            // 결과 처리 (콜백)
            System.out.println("Result: " + result);
        });

        // 다른 작업 수행
        System.out.println("Doing other work...");

        // 주 스레드가 종료되지 않도록 대기
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
