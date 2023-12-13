import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class PanelTester extends JFrame {
    private Vector<Point> points;

    public PanelTester() {
        points = new Vector<Point>();
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        setVisible(true);
    }
    public void makeUi() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JLabel label = new JLabel("★");
                panel.add(label);
                label.setSize(32, 32);
                label.setLocation(e.getPoint());
                points.add(e.getPoint());
                System.out.println(points.size());
            }
        });
       
        add(panel);
    }

    public static void main(String[] args) {
        new PanelTester();
    }
}
