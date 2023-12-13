import java.util.Random;
public class CalcAverage {
    public static void main(String[] args) {

    }
    public int[] makeArray(int n) {
        int[] data = new int[n];
        Random rnd = new Random();
        for(int i=0; i<n; i++) {
            data[i] = rnd.nextInt(101);
        }
        return data;
    }
    public int[] makeArray(int n, int low, int high) {
        return null;
    }
    public int getTotal(int[] data) {
        int total = 0;
        for(int i=0; i<data.length; i++) {
            total += data[i];
        }
        return total;
    }
    public double getAverage(int[] data) {
        //int total = getTotal(data);
        //double avg = (double)total / data.length;
        //return avg;
        return (double)getTotal(data) / data.length;
    }
}