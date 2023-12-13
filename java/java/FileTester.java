import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyIn = new Scanner(new File("data.dat"));
        System.out.println(keyIn.nextInt());
        System.out.println(keyIn.nextDouble());
        System.out.println(keyIn.next());
        
    }
}