import java.io.*;

public class FileTester2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File("data.dat"));

        writer.print("123 ");
        writer.print("1.5 ");
        writer.print("Morning");

        writer.close();
    }
}
