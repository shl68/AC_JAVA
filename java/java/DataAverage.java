import java.io.*;

public class DataAverage {
    public static void main(String[] args) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("bdata.dat");
        DataInputStream dis = new DataInputStream(fis);
        int total = 0;
        int count = 0;
        try {
            while(dis.available() >= 4) {
                total += dis.readInt();
                count += 1;
            }
        }
        catch(IOException e) {
            System.out.println("입력 오류...");
        }
        if(count > 0) {
            System.out.println((double)total / count);
        }
    }
}
