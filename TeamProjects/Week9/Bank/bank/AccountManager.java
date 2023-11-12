package bank;

import java.util.Scanner;
import java.util.Vector;

import account.*;
import util.*;

public class AccountManager implements Compare<Integer>{  
    private static IdentifiedAccount account;
    private static Vector<IdentifiedAccount> accounts = new Vector<IdentifiedAccount>();

    public void printMenu() {
        System.out.println("\n\t메뉴\t\n");
        System.out.println("1. 계좌 생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 잔액 확인");
        System.out.println("5. 계좌 닫기\n");
        System.out.println("0. 종료하기\n");
        System.out.print("번호를 입력해주세요: ");
    }

     public static int getNumber(){         //문자열을 입력받고 정수로 변환해서 반환하는 메서드
        Scanner getNumber = new Scanner(System.in);
        String setNumber = getNumber.nextLine();
        int number;
        try{
            if(setNumber==""){
                number = 0;     //아무 입력을 안 했을 때 0으로 설정
            }
            else{
                number = Integer.parseInt(setNumber);
            }
        }
        catch(java.lang.NumberFormatException e){      //가 아닌 다른 
            System.out.print("번호를 입력해주세요. : ");
            number = getNumber();
        }
       return number;
    }

    public int IdEqualNumber(AccountManager accountManager){    //accounts에 저장된 account 객체 중에
        Scanner sc = new Scanner(System.in);                    //입력한 id와 동일한 id가 있다면 인덱스 값을 반환하는 메서드

        System.out.print("계좌번호를 입력해주세요: ");
        int id = sc.nextInt();

        Integer valueID = Integer.valueOf(id);
        Finder<Integer> iFinder = new Finder<Integer>();

        int idEqual = iFinder.finder(accountManager, accounts.size() ,valueID); 
        return idEqual;
    }
    
    public void checkEqualID(int selectNum,AccountManager accountManager){  //IdEqualNumber 메서드 값을 받아
        int idEqual =  IdEqualNumber(accountManager);                       //선택한 메뉴 번호에 따라 계좌 관리 메서드 호출

        if(idEqual == -1){
            System.out.println("없는 계좌 번호입니다. ");
        }
        else if(idEqual<accounts.size() && idEqual>=0 ){ 
            System.out.println("계좌 번호를 찾았습니다.\n");                   
            account = accounts.get(idEqual);

            switch (selectNum) {
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    getBalance();
                    break;
                case 5:
                    closeAccount(idEqual);
                    break;
            }
        }
    }

    public int getAccountId(int n){             //IdentifiedAccount 객체 참조값을 저장하고 있는
        account = accounts.get(n);              //account변수에서 정수 id를 가져오는 메서드
        return account.getID();
    }

    public boolean isEqual(int n, Integer m){   //인터페이스 구현을 위한 메서드
        if(m == getAccountId(n)){
            return true;
        }
        else{
            return false;
        }
    }

    //계좌 관리 메서드
    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n계좌 번호를 입력해주세요: ");
        int id = sc.nextInt();

        System.out.print("초기 예금액을 입력해주세요: ");
        int balance = getNumber();
        if(balance==0){
            account = new IdentifiedAccount(id);
        }
        else{
            account = new IdentifiedAccount(id, balance);
        }
        accounts.add(account);
    }

    public void deposit(){     
        System.out.print("\n입금할 금액을 입력해주세요: ");
        int balance = getNumber();
        try 
        {
            account.deposit(balance);
            System.out.println("입금을 완료했습니다.");
        }
        catch (NegativeAmountException e) {     //음수를 입력할 때 예외처리리
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(){ 
        System.out.print("\n출금할 금액을 입력해주세요: ");
        int balance = getNumber();
        try 
        {
            account.withdraw(balance);
            System.out.println("출금을 완료했습니다.");
        }
        catch (NegativeAmountException e)       //음수를 입력할 때 예외 처리
        {
            System.out.println(e.getMessage());
        }
        catch (NotEnoughBalanceException e)     //잔액보다 큰 값을 출금할 때 예외 처리
        {
            System.out.println(e.getMessage());
        }
    }

    public void getBalance(){
        System.out.println("현재 잔액은 : "+ account.getBalance()+ "원입니다.");
    }

    public void closeAccount(int id){
        System.out.println("현재 잔액은 : "+ account.getBalance()+ "원입니다.");
        accounts.remove(id);
        System.out.println("계좌를 삭제합니다.");
    }
    
    public static void main(String[] args){
        AccountManager accountManager = new AccountManager(); 
    
        do {
            accountManager.printMenu();
            int selectNum = getNumber();

            if(selectNum == 1){
                accountManager.createAccount();
            }
            else if(selectNum>1 && selectNum<6){ 
                accountManager.checkEqualID(selectNum,accountManager);
            }
            else if(selectNum == 0){
                System.out.println("\n프로그램을 종료합니다");
                break;
            }
            else{
                System.out.println("\n다시 입력해주세요");
            }
        }while(true);
    }
}
