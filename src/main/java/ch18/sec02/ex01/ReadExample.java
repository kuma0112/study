package ch18.sec02.ex01;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("../test1.txt");
            // write 할 때 3개를 했다는 걸 알고 있는 경우
//            byte a = (byte)is.read();
//            byte b = (byte)is.read();
//            byte c = (byte)is.read();
//
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);

            // 몇 개인지 모를 때
            while (true) {
                int data = is.read();
                if (data == -1) {
                    break;
                }
                System.out.println(data);
            }

            is.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
