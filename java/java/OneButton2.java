import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class OneButton2 extends JFrame {
    public OneButton2() {
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JButton button = new JButton("GOOD");
        button.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("X=" + e.getX() + " Y=" + e.getY());                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        });
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("X=" + e.getX() + " Y=" + e.getY());
                switch (e.getButton()) {
                    case MouseEvent.BUTTON1:
                        System.out.println("LEFT");
                        break;
                    case MouseEvent.BUTTON2:
                        System.out.println("CENTER");
                        break;
                    case MouseEvent.BUTTON3:
                        System.out.println("RIGHT");
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });        
        add(button);
    }
    public static void main(String[] args) {
        new OneButton2();
    }
    
}
