import javax.swing.*;
import java.awt.*;


public class FourthGUI extends JFrame {
    public FourthGUI(){
        setSize(400,350);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("2023-11-30 교수님이 주문한 윈도우 GUI 실습");

        makeUi();
        makeMenu();

        setVisible(true);
    }

    private void makeUi(){
       JPanel panel = new JPanel();

       panel.setLayout(new GridLayout(1,2)); // 나란히, 1행 2열
        panel.add(new JButton("BTN1"));
        panel.add(new JButton("BTN2"));

       setLayout(new BorderLayout());
       add(panel, BorderLayout.NORTH);

       JPanel panel1 = new JPanel();

       panel1.setLayout(new GridLayout (1,3));
       panel1.add(new JButton("BTN1"));
       panel1.add(new JButton("BTN2"));
       panel1.add(new JButton("BTN3"));

       setLayout(new BorderLayout());
       add(panel1,BorderLayout.SOUTH);

    }
    private void makeMenu(){

    }
    public static void main(String[] args) {
        new FourthGUI();
    }
}

