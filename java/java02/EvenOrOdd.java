import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] argv) {
        Scanner keyIn = new Scanner(System.in); 
        int n;
        System.out.print("정수값을 입력 : ");
        n = keyIn.nextInt();
        System.out.println((n % 2) == 0 ? "짝수" : "홀수" );
    }
}
