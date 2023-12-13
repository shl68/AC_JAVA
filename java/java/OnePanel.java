import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.*;

public class OnePanel extends JFrame {
    public OnePanel() {
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JPanel panel = new JPanel();
        panel.setFocusable(true);
        panel.requestFocus();
        panel.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_F1:
                        System.exit(0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("RIGHT");
                        break;
                    case KeyEvent.VK_A:
                        System.out.println(e.getKeyChar());
                        break;
                    default:
                        System.out.println("Default : " + e.getKeyCode() + e.getKeyChar());
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
        
        
        add(panel);

        
    }
    public static void main(String[] args) {
        new OnePanel();
    }
}
