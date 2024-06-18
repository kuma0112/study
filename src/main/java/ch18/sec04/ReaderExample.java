package ch18.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("../test4.txt");

        // 한 문자씩
//        while(true) {
//            int data = reader.read();
//            if (data == -1) break;
//            System.out.print((char) data);
//        }
//        reader.close();

        // 배열에
        char[] data = new char[100];
        int num = reader.read(data);
        for (int i = 0; i < num; i++) {
            System.out.println(data[i]);
        }
        reader.close();
    }
}
