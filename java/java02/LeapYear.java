import java.util.Scanner;

public class LeapYear {
    public static void main(String[] argv) {
        Scanner keyIn = new Scanner(System.in);
        int year;
        System.out.print("년도 입력 : ");
        year = keyIn.nextInt();
        if((year % 4 != 0) || (year % 400 != 0)) {
            System.out.println("평년");
        }
        else {
            System.out.println("윤년");
        }
    }
}
