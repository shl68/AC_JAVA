import java.util.Scanner;

public class EvenOdd{

public static void main(String[] args) {
    
    int n;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    if (n % 2 == 0)
    {
        System.out.println("짝수");
    }
    else if ( n % 2 == 1)
    {
        System.out.println("홀수");
    }
    
}
}
