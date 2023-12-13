import javax.swing.*;
import java.awt.event.*;

public class MouseTester extends JFrame implements MouseListener {
    public MouseTester() {
        setSize(350, 250);
        setTitle("이벤트 처리 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JPanel panel = new JPanel();
        panel.addMouseListener(this);// step 3.
        add(panel);
    }
    @Override
    public void mouseClicked(MouseEvent e ) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        switch(e.getButton()) {
            case MouseEvent.BUTTON1:
            System.out.println("왼쪽 버튼");
            break;
            case MouseEvent.BUTTON2:
            System.exit(0);
            break;
            case MouseEvent.BUTTON3:
            System.out.println("오른쪽 버튼");
            break;
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    public static void main(String[] args) {
        new MouseTester();
    }
}
