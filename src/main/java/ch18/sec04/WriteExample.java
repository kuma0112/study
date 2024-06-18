package ch18.sec04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        // 문자
        Writer writer = new FileWriter("../test4.txt");

        // char 한그 ㄹ자
        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);

        // char 배열
        char[] array = {'C', 'D', 'E'};
        writer.write(array);

        // 문자열
        writer.write("FGH");

        writer.flush();
        writer.close();
    }
}
