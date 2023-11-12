package account;

public class Account{
    private int balance;

    public Account(){       //초기 예금액을 입력하지 않았다면 0원으로 객체 생성
        balance = 0;
    }
    
    public Account(int n){  //입력한 예금액을 초기 예금액으로 객체 생성
        balance = n;
    }

    public void deposit(int money){
        if (money>=0)
            balance+=money;
        else
            throw new NegativeAmountException();
    }
    
    public void withdraw (int money){
        if(balance<money)
            throw new NotEnoughBalanceException();
    
        else if (money>=0)
            balance-=money;
        else
            throw new NegativeAmountException();
    }

    public int getBalance(){
        return balance;
    }
}


