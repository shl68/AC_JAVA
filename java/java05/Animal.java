public class Animal  {
    private int n;
        
    public void set(int i) {
        n = i;
    }
    public int get() {
        return n;
    }
    @Override
    public boolean equals(Object obj) {
        Animal target = (Animal)obj;

        return n == target.get();

    }
    @Override
    public String toString() {
        return "Hello : " + n;
    }
    public static void main(String[] args) {
        Animal a, b;
        a = new Animal();
        b = new Animal();
        a.set(99); 
        b.set(99);
        System.out.println(a);
        System.out.println(a.equals(b));
    }
    
}
