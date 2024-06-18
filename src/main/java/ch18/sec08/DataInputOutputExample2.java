package ch18.sec08;

import java.io.*;

public class DataInputOutputExample2 {
    public static void main(String[] args) {
//        OutputStream os = new FileOutputStream("test8.db");
//        DataOutputStream dos = new DataOutputStream(os);
//
//        dos.writeUTF("홍길동");
//        dos.writeDouble(99.1);
//        int num = 100;
//        dos.writeInt(num);
//
//        dos.writeUTF("이길동");
//        dos.writeDouble(89.0);
//        num = 200;
//        dos.writeInt(num);
//
//        dos.flush();
//        dos.close();
//        os.close();
//        InputStream is = null;
//        DataInputStream dis = null;

        try (// 아래를 자원이라고 보고, try with resources - catch 문.
             // 이렇게 쓰면 자동으로 close가 됨.

             // try() 안에서 선언, 생성된 resources 객체 (AutoCloseable을 implement했다면) 자동으로 close가 된다.
                InputStream is = new FileInputStream("test8.db");
                DataInputStream dis = new DataInputStream(is);
                )
        {
            for (int i = 0; i < 2; i++) {
                System.out.print(dis.readUTF());
                System.out.print(dis.readDouble());
                System.out.print(dis.readInt());
                System.out.println();
            }

            dis.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
