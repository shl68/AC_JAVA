import java.util.Random;

interface Sortinfce {
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

public class AccountData implements Sortinfce {
    private Account[] accounts = new Account[10];

    public AccountData() {
        Random rand = new Random();
        for (int i = 0; i < accounts.length; i++) {
            int balance = 1000 + rand.nextInt(1001);
            accounts[i] = new Account(balance);
        }
    }


}
