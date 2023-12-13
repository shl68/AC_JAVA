import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

public class MouseTester2 extends JFrame {
    public MouseTester2() {
        setSize(350, 250);
        setTitle("이벤트 처리 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JPanel panel = new JPanel();
        panel.setFocusable(true);
        panel.requestFocus();
        panel.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_F1:
                    System.out.println("F1");
                    break;
                    case KeyEvent.VK_HOME:
                    System.out.println("HOME");
                    break;
                    case KeyEvent.VK_Q:
                    System.exit(0);
                    break;
                }

            }
            public void keyReleased(KeyEvent e) {
                
            }
            public void keyTyped(KeyEvent e) {
                
            }
        });
        add(panel);
    }

    public static void main(String[] args) {
        new MouseTester2();
    }
}
