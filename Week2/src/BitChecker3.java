import java.util.Scanner;

public class BitChecker3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //if ( n < 1 || n > 15){
        //System.out.println("1과 15 사이만 입력하세요");
        //}

        int bit3 = n / 8;
        System.out.println( n / 8 == 1 ? "Bit-3 = 1" : "Bit-3 = 0");

        int bit2 = n / 4;
        System.out.println( bit2 % 4 == 1  ? "Bit-2 = 1" : "Bit-2 = 0");

        int bit1 = n / 2;
        System.out.println( bit1 % 2 == 1  ? "Bit-1 = 1" : "Bit-1 = 0");

        int bit0 = n / 1;
        System.out.println( bit0 % 2 == 1  ? "Bit-0 = 1" : "Bit-0 = 0");
        

        
    }
}
