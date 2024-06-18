package ch18.sec10;

import java.io.*;

public class ObjectOutputInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        OutputStream os = new FileOutputStream("member.data");
//        ObjectOutputStream oos = new ObjectOutputStream(os);
//
//        // 객체 생성
//        Member m1 = new Member("aaa","홍길동", "111-222");
//        oos.writeObject(m1);
//        oos.flush();
//        oos.close();
//        os.close();

        InputStream is = new FileInputStream("member.data");
        ObjectInputStream ois = new ObjectInputStream(is);

        Member member = (Member) ois.readObject();
        System.out.println(member);
    }
}
