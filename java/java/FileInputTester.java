import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTester {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("data.bin");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.available());
        System.out.println(dis.readInt());// 4 bytes
        System.out.println(dis.available());
        System.out.println(dis.readDouble()); // 8 bytes
        System.out.println(dis.available());
        System.out.println(dis.readShort()); // 2 bytes
        System.out.println(dis.available());
        System.out.println(dis.readBoolean()); // 1 byte
        System.out.println(dis.available());
    }
}
