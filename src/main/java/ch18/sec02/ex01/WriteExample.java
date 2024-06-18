package ch18.sec02.ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        try {
            OutputStream os = new FileOutputStream("../test1.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
