public class Account {
    // Fields
    private int balance;

    // Constructors
    public Account() {
        this(0);
    }
    public Account(int n) {
        balance = n;
    }
    // Methods
    public void deposit(int money)  {
        if(money >= 0)
            balance += money;
    }
    public void withdraw(int money) {
        if(money >= 0 && balance >= money)
            balance -= money;
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account my = new Account();
        my.deposit(1000);
        System.out.println(my.getBalance());
        my.withdraw(-1500);
        System.out.println(my.getBalance());
    }
}







