//package module5;
//
//
//import java.nio.ByteBuffer;
//
//import java.nio.channels.FileChannel;
//
//import java.nio.file.Paths;
//
//import java.nio.file.StandardOpenOption;
//
//import java.io.IOException;
//
//
//public class NIOExample {
//
//    private String filePath;
//
//
//    public NIOExample(String filePath) {
//
//        this.filePath = filePath;
//
//    }
//
//
//    public void readFile() {
//
//        try (FileChannel fileChannel = FileChannel.open(Paths.get(filePath), StandardOpenOption.READ)) {
//
//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//
//            int bytesRead = fileChannel.read(buffer);
//
//            buffer.flip();
//
//            while (buffer.hasRemaining()) {
//
//                System.out.print((char) buffer.get());
//
//            }
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//
//    public void writeFile(String content) {
//
//        try (FileChannel fileChannel = FileChannel.open(Paths.get(filePath), StandardOpenOption.WRITE)) {
//
//            ByteBuffer buffer = ByteBuffer.wrap(content.getBytes());
//
//            fileChannel.write(buffer);
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//        NIOExample example = new NIOExample("src/main/resources/example.txt");
//
//        example.writeFile("This is a test content.");
//
//        example.readFile();
//
//    }
//
//}
//
