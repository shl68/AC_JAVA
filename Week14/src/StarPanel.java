import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class StarPanel extends JFrame {
    public StarPanel(){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("size =" + size);
        setSize((int)size.getWidth()/2,(int)size.getHeight()/2); //화면의 4분의 1 비율로 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }

    public void makeUi(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        panel.setFocusable(true);
        panel.requestFocus();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel label = new JLabel("★"); //별표 출력
                panel.setSize(24,24);
                panel.setLocation(e.getX(),e.getY());
                panel.add(label);
            }
        }
        );
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_HOME){
                    System.exit(0);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

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

