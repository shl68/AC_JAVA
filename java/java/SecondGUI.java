import javax.swing.*;
import java.awt.*;

public class SecondGUI extends JFrame {
    public SecondGUI() {
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("두번째 윈도");
        makeUi();
        makeMenu();
        setVisible(true);
    }
    protected void makeUi() {
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(1,2));
        panel.add(new JButton("BTN1"));
        panel.add(new JButton("BTN2"));

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);

        //JLabel btn1 = new JLabel("이것은 버튼");
        //JButton btn2 = new JButton("Button2");
        ///Font font = new Font("바탕", Font.BOLD, 24);

        // setLayout(null);
        //setLayout(new FlowLayout());

        //btn1.setSize(100, 50);
        //btn1.setLocation(100, 50);

        //btn2.setSize(60, 25);
        //btn2.setLocation(100, 100);
        //btn1.setForeground(Color.RED);
        //btn1.setBackground(Color.GREEN);
        //btn1.setOpaque(true);
        //btn1.setFont(font);

        //add(btn1);
        //add(btn2);

        // FlowLayout layout = new FlowLayout(); // Step 1.
        //GridLayout layout = new GridLayout(3, 4);
        //BorderLayout layout = new BorderLayout();
        //CardLayout layout = new CardLayout();
        //setLayout(layout);  // Step 2.

        //for(int i=0; i<12; i++) {
        //    JButton btn = new JButton("Button " + i);
        //    add(btn, String.valueOf(i));
        //}

        //layout.show(getContentPane(), "11");

        // BorderLayout
        //add(new JButton("중간"), BorderLayout.CENTER);
        //add(new JButton("왼쪽"), BorderLayout.WEST);
        //add(new JButton("오른쪽"), BorderLayout.EAST);
        //add(new JButton("북쪽"), BorderLayout.NORTH);
        //add(new JButton("남쪽"), BorderLayout.SOUTH);


        //JLabel label = new JLabel("이것은 문자열 출력"); // Step 1.
        //JPasswordField field = new JPasswordField(); // Step 1.
        //JButton button = new JButton("누르시오."); // Step 1.

        //add(label);// Step 2.
        //add(button); // Step 2.
        //add(field); // Step 2.

    }
    private void makeMenu() {

    }
    public static void main(String[] args) {
        new SecondGUI();
    }
}
