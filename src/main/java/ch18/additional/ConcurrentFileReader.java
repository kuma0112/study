package ch18.additional;

import java.io.*;

public class ConcurrentFileReader implements Runnable{
    private String filePath;

    public ConcurrentFileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (
                InputStreamReader is = new FileReader(filePath);
                BufferedReader reader = new BufferedReader(is);
                ) {
            String line;
            while (true) {
                line = reader.readLine();
                if (line == null ) break;
                System.out.println(Thread.currentThread().getName()+ "-" +line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] filePaths = {"../test4.txt", "../test8.txt"};

        for (String filePath : filePaths) {
            Thread thread = new Thread(new ConcurrentFileReader(filePath));
            thread.start();
        }
    }
}
