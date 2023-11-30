public class MyAccount <V> { // 지네릭, V라는 데이터 타입이 있다고 가정하고 밑에 작성

        //private int balance;
        private  V  balance;

        public MyAccount()
        {
            balance = null;

        }

        public void set(V v){
            balance = v;

        }
        public V get(){
            return balance;
        }
        public static void main(String[] args){
            MyAccount<Integer> acc = new MyAccount<Integer>(); // 마이어카운트 만들때 v라고 있다고 쳤는데 필요한 것은 INT. 여기서 작성
            MyAccount<Double> acc2 = new MyAccount<Double>(); // 마찬가지로 DOUBLE 형 작성하기 위해 치환
            acc2.set(Double.valueOf(1.1));
            acc.set(Integer.valueOf(1500));
            System.out.println(acc2.get()+"달러");
            System.out.println(acc.get()+"원"); // myaccount 한번만 정의하고 사용시 정의해서 한화 또는 달러등 상황에 따라서 편리하게 사용 가능




        }

}
