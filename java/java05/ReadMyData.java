import java.io.*;

public class ReadMyData {
    public static void main(String[] args) {
        // file -> 4 bytes -> int        
        // file -> 4 bytes : FileInputStream
        // 4 bytes -> int : DataInputStream
        FileInputStream fis=null; 
        DataInputStream dis=null; 
        int total = 0;
        int count = 0;
        try {
            fis = new FileInputStream(new File("bdata.dat"));
            dis = new DataInputStream(fis);
        } catch(FileNotFoundException e ) {
            System.out.println("파일에 접근할 수 없음.");
            System.exit(0);
        }

        try {
            while(true) {
                if(dis.available() < Integer.BYTES) {
                    break;
                }
                else {
                    total += dis.readInt();
                    count ++;
                }
            }
        } catch(IOException e) {
            System.out.println("읽기 오류.");
            System.exit(0);
        }
        System.out.println(total);
        System.out.println(count);
    }
}
