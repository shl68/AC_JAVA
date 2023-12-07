import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Onepanel extends JFrame {
    public Onepanel(){

        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        //setVisible(true);
    }

    public void makeUi(){ //키이벤트 1. 포커스 받기 가능 2.req focus
        JLabel panel = new JLabel();//만들어서
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) { //키보드 눌렀다 때는
                //f1 누르면 프로그램 종료, 오른쪽 방향 누르면 rignt 출력, a 누르면 누른 코드 출력
                    switch (e.getKeyCode()){
                        case KeyEvent.VK_F1:
                            System.exit(0);
                            break;
                        case KeyEvent.VK_RIGHT:
                            System.out.println("->");
                            break;
                        case KeyEvent.VK_A:
                            System.out.println(e.getKeyChar());
                            break;
                        default:
                            break;
                    }
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        panel.setFocusable(true); // 포커스 받기 가능
        panel.requestFocus();
        panel.addKeyListener(null);
        add(panel);//넣음
        setVisible(true);


    }

    public static void main(String[] args) {
        new Onepanel();
    }
}
