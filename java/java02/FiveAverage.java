
public class FiveAverage {
    public static void main(String[] argv) {
        int[] data;
        int[] data2;
        data = new int[10];
        data2 = data;
        data[0] = 99;
        System.out.println(data2[0]);
    }    
}
