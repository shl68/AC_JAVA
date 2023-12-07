import javax.swing.*;

public class OneButton extends JFrame { // JFrame 으로 부터 상속
    public OneButton() { //생성자
        setSize(250,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 누를시
        makeUi();
        setVisible(true);//화면에 보이게


    }
    public void makeUi(){
        JButton button = new JButton("누르세요");
        //버튼을 누르면 이벤트 분배 스레드에 전달 , 버튼에 엑션 이벤트 처리할 리스너를 등록해야함

        ActionHandler handler =new ActionHandler(); //step2. 구현한 클래스 이용해 객체 생성
        MyMouseHandelr handelr2 =new MyMouseHandelr();

        button.addActionListener(handler); //step.3 생성객체를 이벤트 소스에 등록하는 것
        button.addMouseListener(handelr2);



        add(button);//컨테이너에 포함

    }
    public static void main(String []args){

        new OneButton();         //메인메소드 원버튼 객체 생성 , 참조값을 리턴하지만 =을 이용하여 저장하지 않음


    }

}