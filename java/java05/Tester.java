
import account.Account;
import account.NegativeAmountException;

public class Tester {
    public <T> T get(T o) {
        return o;
    }

    public static void main(String[] args) {

        Tester obj = new Tester();
        System.out.println(obj.get(Integer.valueOf(99)));
        System.out.println(obj.<String>get("GOOD"));
    }
}
