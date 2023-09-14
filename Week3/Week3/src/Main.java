import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year % 4 == 0 && year % 400 == 0)
        {
            System.out.println("년도" + year + "은 윤년입니다");
        }
        else
        {
            System.out.println("년도" + year + "은 윤년이 아닙니다.");
        }

    }

}
