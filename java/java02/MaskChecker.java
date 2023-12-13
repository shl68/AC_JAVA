import java.util.Scanner;
public class MaskChecker {
    public static void main(String[] argv) {
        Scanner keyIn = new Scanner(System.in);
        int n;
        int mask = 0b1; // 0000_0001
        System.out.print("정수를 입력 : ");
        n = keyIn.nextInt();
        System.out.print("Bit-0 : ");
        System.out.println((n & mask) == 0 ? 0 : 1 );
        mask <<= 1;// 0000_0010
        System.out.print("Bit-1 : ");
        System.out.println((n & mask) == 0 ? 0 : 1 );
        mask <<= 1;
        System.out.print("Bit-2 : ");
        System.out.println((n & mask) == 0 ? 0 : 1 );
        mask <<= 1;
        System.out.print("Bit-3 : ");
        System.out.println((n & mask) == 0 ? 0 : 1 );
    }
}
