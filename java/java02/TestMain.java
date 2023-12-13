import java.util.Scanner;

public class TestMain {
    public static void main(String[] argv) {
        Scanner keyIn = new Scanner(System.in);
        int year;
        System.out.print("년도를 입력 : ");
        year = keyIn.nextInt();
        if((year % 4 != 0) || 
           ((year % 100 == 0) && (year % 400 != 0))) {
            System.out.println("평년");
        }
        else {
            System.out.println("윤년");
        }

    }
}
