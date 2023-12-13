import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class StarPanel extends JFrame  {
    public StarPanel() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)size.getWidth() / 2, (int)size.getHeight() / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        panel.setFocusable(true);
        panel.requestFocus();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel label = new JLabel("★");
                panel.add(label);
                label.setSize(24, 24);
                label.setLocation(e.getX(), e.getY());
            }
        });
        panel.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_HOME) {
                    System.exit(0);
                }                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
    }
    public static void main(String[] args) {
        new StarPanel();
    }
    
}
