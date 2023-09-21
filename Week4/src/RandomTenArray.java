import java.util.Random;
public class RandomTenArray {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(101));
        int [] a = new int[10];
        for(int i = 0; i<10; i++){

            a[i]  = rand.nextInt(101);
            System.out.println(a[i]);
        }


    }
}
