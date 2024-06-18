package ch18.sec05;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림...");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("../test5.txt");
        // 여기까지는 바이트 스트림. 이것을 캐릭터로 바꿔서 utf-8 인코딩하고 싶다면.
        Writer writer = new OutputStreamWriter(os, "utf-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("../test5.txt");
        // 여기까지는 바이트 스트림. 이것을 캐릭터로 바꿔서 utf-8 인코딩하고 싶다면.
        Reader reader = new InputStreamReader(is, "utf-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        return new String(data, 0, num);
    }
}
