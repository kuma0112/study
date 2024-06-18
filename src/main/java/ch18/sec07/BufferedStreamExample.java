package ch18.sec07;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) throws IOException{
        // copy() 하는데, 입출력 stream 사용
        InputStream is = new FileInputStream("../test_image.png");
        OutputStream os = new FileOutputStream("../test_image4.png");
        long nonBuffer = copy(is, os);
        System.out.println(nonBuffer);

        // copy() 하는데, buffer stream 사용
        InputStream is2 = new FileInputStream("../test_image.png");
        OutputStream os2 = new FileOutputStream("../test_image4.png");
        BufferedInputStream bis = new BufferedInputStream(is2);
        BufferedOutputStream bos = new BufferedOutputStream(os2);
        long buffer = copy(bis, bos);
        System.out.println(buffer);

        is.close();
        os.close();
        bis.close();
        bos.close();
        is2.close();
        os2.close();
    }

    public static long copy(InputStream is, OutputStream os) throws IOException {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }

        long end = System.nanoTime();

        return end-start;
    }
}
