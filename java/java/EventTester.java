import javax.swing.*;
import java.awt.event.*;

// Step 1.
public class EventTester extends JFrame implements ActionListener{
    public EventTester() {
        setSize(350, 250);
        setTitle("이벤트 처리 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JButton button = new JButton("Press me..");
        //ActionHandler handler = new ActionHandler(); // Step 2.
        //ActionHandlerClass handler = new ActionHandlerClass();// Step 2.
        MouseHandler mHandler = new MouseHandler(); // Step 2.
        //button.addActionListener(handler);  // Step 3.
        //button.addActionListener(this);
        button.addMouseListener(mHandler); // Step 3.
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("익명클래스 이용.");
            }
        });

        add(button);
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("그냥 구현함.");
    }

    public static void main(String[] args) {
        new EventTester();
    }
    class ActionHandler implements ActionListener {  // Step 1.

        public void actionPerformed(ActionEvent e) {
            System.out.println("눌러짐.");
        }
    }
    class MouseHandler implements MouseListener {  // Step 1.
        public void mouseEntered(MouseEvent e) {
            System.out.println("영역에 들어옴.");
        }
        public void mouseExited(MouseEvent e) {
            System.out.println("영역에서 나감.");
        }
        public void mousePressed(MouseEvent e) {
            
        }
        public void mouseReleased(MouseEvent e) {
            
        }
        public void mouseClicked(MouseEvent e) {
            
        }
    }
}
