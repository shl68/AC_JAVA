import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OneButton extends JFrame implements ActionListener {
    public OneButton() {
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JButton button = new JButton("눌러봐");

        //ActionHandler handler = new ActionHandler(); // Step 2.
        //InnerActionHandler handler = new InnerActionHandler(); // Step 2.
        MyMouseHandler handler2 = new MyMouseHandler(); // Step 2.

        //button.addActionListener(handler); // Step 3.

       // button.addActionListener(new ActionListener(){
       //     @Override
       //     public void actionPerformed(ActionEvent e) {
       //         System.exit(0);
       //     }
       // } ); // Step 3.
       button.addActionListener(this);

        //button.addMouseListener(handler2); // Step 3.
        button.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Good Morning....");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });

        add(button);
    }
    public static void main(String[] args) {
        new OneButton();
    }
    // Step 1.
    public class InnerActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
