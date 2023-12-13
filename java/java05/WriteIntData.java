import java.io.*;

public class WriteIntData {
    public static void main(String[] args) throws Exception{
        // output stream : int -> byte -> file
        // byte -> file : FileOutputStream
        // int -> byte : DataOutputStream
        FileOutputStream fos = new FileOutputStream(new File("data.bin"));
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(1);// 4 bytes
        dos.writeDouble(3.14);  // 8 bytes
        dos.writeShort(-1); // 2 bytes
        dos.close();

    }
}
