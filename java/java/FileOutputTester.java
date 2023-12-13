import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputTester {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("data.1");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        try {
            osw.write("GOOD");
            osw.close();
        }
        catch(IOException e ) {
            System.out.println("입출력 오류.");
        }
        
    }
}
