package ch18.additional;

import java.io.FileInputStream;
import java.io.IOException;

public class BlockingSynchronousExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("../test4.txt")) {
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
