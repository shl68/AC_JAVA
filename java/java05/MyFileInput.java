import java.util.Scanner;
import java.io.File;

public class MyFileInput {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("test2.abc"));
        
        System.out.println(in.nextInt() + 1);
        System.out.println(in.next() + 1);




    }
}
