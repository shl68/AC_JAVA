import java.io.*;

public class MyFileOutput {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(new File("test2.abc")) ;

        writer.println("123 456");

        writer.close();

    }
}
