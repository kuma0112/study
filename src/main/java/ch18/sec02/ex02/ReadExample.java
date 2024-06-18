package ch18.sec02.ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("../test2.txt");
            // byte 배열을 준비 -> stream 저장
            byte[] data = new byte[100];
//            while (true) {
//                int num = is.read(data);
//                if (num == -1) break;
//                for (int i = 0; i < num; i++) {
//                    System.out.println(data[i]);
//                }
//            }

            int num = is.read(data);
            for (int i = 0; i < num; i++) {
                System.out.println(data[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
