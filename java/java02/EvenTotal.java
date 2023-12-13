public class EvenTotal {
    public static void main(String[] argv) {
        int total = 0;
        for(int i=0; i<10; i++) {
            if(i % 2 == 0) {
                total += i;
            }
            
        }
        System.out.println(total);
    }
}
