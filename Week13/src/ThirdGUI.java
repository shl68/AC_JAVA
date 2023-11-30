import javax.swing.*;
import java.awt.*;


public class ThirdGUI extends JFrame {
    public ThirdGUI(){
        setSize(400,350);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("2023-11-30 상속받아 생성한 윈도우 GUI 실습");

        makeUi();
        makeMenu();

        setVisible(true);
    }

    private void makeUi(){ //생성 순서 상관 x 컨테이너에 마지막 추가된 순서 우선 출력
        /*JPasswordField pwfield = new JPasswordField();
        JLabel label = new JLabel("안녕하세요");
        JButton button = new JButton("누르세요");

        add(button);
        add(label);
        add(pwfield);*/

        //CardLayout layout = new CardLayout();
        //setLayout(layout);

        JButton btn1= new JButton("BTN1");
        JButton btn2= new JButton("BTN2");
        JLabel btn3= new JLabel("이것은 JLabel");
        Font font = new Font("바탕", Font.BOLD, 24);

        //setLayout(null);//배치 관리자 없는 컨테이너
        setLayout(new FlowLayout());

        /*btn1.setSize(100,100); //사용자가 직접 버튼 크기 위치 설정
        btn1.setLocation(100,100);
        btn2.setSize(200,200);
        btn2.setLocation(110,110);*/

        btn1.setForeground(Color.blue);
        btn2.setBackground(Color.blue);
        btn3.setOpaque(true); //투명 불투명
        btn3.setFont(font);




        add(btn1); //버튼 2개 했지만 화면에 표시되지 않음 이전에는 배치 관리자가 설정해주었지만 지금은 아님. 크기 위치를 모르기 때문에 표시 x
        add(btn2);
        add(btn3);



        //FlowLayout layout = new FlowLayout(); //(자동적인 컴포넌트 위치와 장소 설정)
        //setLayout(layout);
        //GridLayout layout =  new GridLayout(3,4);
        //setLayout(layout);
        //BorderLayout layout = new BorderLayout(); // 각각 어디에 넣을지 직접 결정해야함 동서남북센터 5개만 가능
        //setLayout(layout);

        //add(new JButton("중간"), BorderLayout.CENTER);
        //add(new JButton("왼쪽"), BorderLayout.WEST);
        //add(new JButton("오른쪽"), BorderLayout.EAST);
        //add(new JButton( " 북쪽"), BorderLayout.NORTH);
        //add(new JButton("남쪽"), BorderLayout.SOUTH);



        /*for(int i=0; i<12; i++){
            JButton btn = new JButton("BTN" + i );
            add(btn, String.valueOf(i)); // 정수값을 문자열로 변환 0번 1번 2번.. 컴포넌트

        }
        //0~11번 중 5번째 카드 출력
        layout.show(getContentPane(), "5");*/


    }
    private void makeMenu(){

    }
    public static void main(String[] args) {
        new ThirdGUI();
    }
}

