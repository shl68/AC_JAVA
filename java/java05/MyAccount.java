public class MyAccount<V> {
    private  V balance;

    public MyAccount() {
        balance = null;
    }
    public void set(V v) {
        balance = v;
    }
    public V get() {
        return balance;
    }
    public static void main(String[] args) {
        MyAccount<Integer> acc2 = new MyAccount<Integer>();
        acc2.set(Integer.valueOf(1000));
        System.out.println(acc2.get());
    }
}
