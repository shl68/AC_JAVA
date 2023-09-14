import java.util.Scanner;
public class Whileminus1Everage {
    public static void main(String[] args) {
        int input = 0;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            while (true) {
                input = scanner.nextInt();
                total += input;
                if (input < 0) {
                    break;


                }

            }
            System.out.println(total);
        }
    }
}






