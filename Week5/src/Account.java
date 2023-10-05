public class Account


{
    int balance;
    public Account(){
        balance = 0;
    }
    public Account(int balance){
        this.balance = balance;
    }

    public static void main(String[] args) {

        Account myAccount = new Account(1000);
        Account yourAccount = new Account();
        System.out.println("잔액"+myAccount);
        System.out.println("잔액"+yourAccount);


    }
}
