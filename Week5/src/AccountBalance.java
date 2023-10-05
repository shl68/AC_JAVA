public class AccountBalance {

        private int balance;


        public void deposit (int depositmoney){
            balance += depositmoney;
        }
        public void withdraw (int withdrawmoney){
            balance -= withdrawmoney;
        }
        public int getBalance(){
            return balance;
        }

    public static void main(String[] args) {
        Account my = new Account(); //어카운트 객체를 위한 참조값
          //new를 이용해 객체를 생성하고 객체의 참조값을 new 연산자의 결과로 나와 my에 저장함.



    }


}


// TODO: 2023-10-05