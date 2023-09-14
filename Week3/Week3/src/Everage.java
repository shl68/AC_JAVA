import java.util.Scanner;
public class Everage {
    public static void main(String[] args) {
        int input = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            input = scanner.nextInt();
            if(0 < input && input < 100)
            {
                sum = input + sum;
            }
            else {
                System.out.println("숫자를 다시 입력하세요");
                i--;
            }

        }
        System.out.println(sum / 5);

    }
}
