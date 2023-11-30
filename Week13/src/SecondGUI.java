import javax.swing.*;
import java.awt.*;

public class SecondGUI extends JFrame {
    public SecondGUI(){
        //방 법
        // – 탑 컨테이너 없이 JFrame을 상속한 클래스의 객체 생성
        setSize(400,350); //상속받았던 메소드 바로 사용
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("2023-11-30 상속받아 생성한 윈도우 GUI 실습");

        //컴포넌트 붙이기 - 메소드 2개 호출
        makeUi();
        makeMenu();

        setVisible(true);
    }

    //컴포넌트 붙이기 - 메소드 2개 호출
    private void makeUi(){ //메소드여도 private해놓은 이유 - makeUI는 다른 외부에서 호출되면 안 되기 때문. 만약 SecondGUI를 다시 상속하려면 protected 사용
        //JTextField field = new JTextField();
        //add(field);

        //JPasswordField pwfield = new JPasswordField();
        //add(pwfield);

        JLabel label = new JLabel("안녕하세요");
        add(label);

        //JButton button = new JButton("누르세요"); //1. 버튼 생성
        //add(button); // 2. 컨테이너에 추가
    }
    private void makeMenu(){

    }
    public static void main(String[] args) {
    new SecondGUI();
    }
}
