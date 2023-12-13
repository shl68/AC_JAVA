public class Storage <T> {
    private T data;
    public Storage(T s) {
        data = s;
    }
    public void set(T s) {
        data = s;
    }
    public T get() {
        return data;
    }
}
