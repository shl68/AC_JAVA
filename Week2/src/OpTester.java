public class OpTester {
    public static void main(String[] args) {
        int n = -1;

        System.out.println(n >> 2);
        System.out.println(n >>> 2);
        System.out.println(n << 2);

        int m = 16; // 0b10000

        System.out.println(m >> 2);
        System.out.println(m >>> 2);
        System.out.println(m << 2);
    }
}
