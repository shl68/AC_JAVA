package account;

public class Account {
    private int balance;
    public Account() {
        balance = 0;
    }
    public void deposit(int amount) {
        if(amount >= 0) {
            balance += amount;
        }
        else {
            throw new NegativeAmountException();
        }
    }
}
