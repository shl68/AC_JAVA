import java.util.Scanner;
public class FiveArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b [] = new int[5];
        int sum=0;

        System.out.println("정수를 입력 : ");

        for(int i=0; i<5; i++)
        {
            int a = sc.nextInt();
            System.out.println("정수를 입력 : ");
            b[i] = a;
        }
        for(int j=0; j< b.length; j++)
        {
            sum+= b[j];
        }
        System.out.println((double)sum / b.length);

    }
}
