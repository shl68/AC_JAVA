import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter{
    public static void main(String[] args) throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("data.bin");
        DataOutputStream dos = new DataOutputStream(fos);
        try {
            dos.writeInt(1);  // 4 bytes
            dos.writeDouble(3.14);  // 8 bytes
            dos.writeShort(1);  // 2 bytes
            dos.writeBoolean(true);  //1 byte

            dos.close();
        }
        catch(IOException e) {

        }
    }
}
