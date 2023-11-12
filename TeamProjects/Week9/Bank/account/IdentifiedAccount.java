package account;

public class IdentifiedAccount extends Account{
    private int id;

    public IdentifiedAccount(int id){               //초기 예금액을 입력받지 않았을 때 생성자
        super();
        this.id=id;
    }

    public IdentifiedAccount(int id,int balance){   //초기 예금액을 입력받았을 때 생성자
        super(balance);
        this.id=id;
    }
    
    public int getID(){                             //정수 id 값을 반환하는 메서드
        return id;                                  //정수 id 값를 변경할 수 없음
    }
}
