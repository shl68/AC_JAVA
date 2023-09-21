import java.util.Random;
public class FindMaxFromTenRandom {
    public static void main(String[] args) {
        Random rand = new Random(101);
        System.out.println(rand.nextInt(101));
        int[] a = new int[10];

        // public int makeArray() {
        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(101);
        }

        //public int showArray()

        for (int j = 0; j < 10; j++)
            System.out.println(a[j]);


        // public int findMax()

        for (int k = 0; k < 9; k++) {
            {
                if (a[k] <= a[k + 1]) {
                    int temp = 0;
                    temp = a[k + 1];
                    a[k + 1] = a[k];
                    a[k + 1] = temp;
                }
            }

        }
        System.out.println("MAX" + a[9]);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println(a[6]);
        System.out.println(a[7]);
        System.out.println(a[8]);

// public int [] makeArray(int n){
  //  }




    }
}
