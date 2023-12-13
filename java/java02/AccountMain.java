public class AccountMain {
    public static void main(String[] args) {
        Account my = new Account(2000);
        
        my.deposit(1000);
        System.out.println(my.getBalance());

        my.withdraw(-50000);
        System.out.println(my.getBalance());
    }
}
