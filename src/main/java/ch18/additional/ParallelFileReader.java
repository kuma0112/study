package ch18.additional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelFileReader implements Runnable {
    private String filePath;

    public ParallelFileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + " - " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] filePaths = {"../test8.txt", "../test4.txt"};
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (String filePath : filePaths) {
            executor.submit(new ParallelFileReader(filePath));
        }
        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
