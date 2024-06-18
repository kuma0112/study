package ch18.additional;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class NonBlockingSynchronousExample {
    public static void main(String[] args) {
        Path path = Paths.get("../test4.txt");
        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            Future<Integer> result = fileChannel.read(buffer, 0);

            while (!result.isDone()) {
                System.out.println("doing other work...");
            }

            Integer bytesRead = result.get();
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
