public class BitCheceker{

    public static void main(String[] args) {
        int mask = 0b01;
        System.out.println(mask);
        
        mask = mask << 1;
        System.out.println(mask);

        mask <<= 1;
        System.out.println(mask);

        mask = mask << 1;
        System.out.println(mask);

    }
}