package ch18.additional;

import java.util.concurrent.*;

public class BlockingAsynchronousExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future  = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                // 긴 작업 수행
                Thread.sleep(2000);
                return "Result from long running task";
            }
        });

        System.out.println("Doing other work...");

        try {
            String result = future.get();
            System.out.println("Result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
