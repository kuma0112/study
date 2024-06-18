package ch18.sec03;

import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("../test_image.png");
        OutputStream os = new FileOutputStream("../test_image3.png");

        // 이 모든걸 한 방에 하는 방법이 아래에!
//        byte[] data = new byte[1024]; // 준비된 자료구조의 크기보다 클 때
//        while (true) {
//            int num = is.read(data);
//            if (num == -1) break;
//            os.write(data, 0, num);
//        }

        is.transferTo(os);
        os.flush();
        os.close();
        is.close();
    }
}
