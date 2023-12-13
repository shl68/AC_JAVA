import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Circles extends JFrame {
    public Circles() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)screenSize.getWidth()/2, (int)screenSize.getHeight()/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeUi();
        makeMenu();
        setVisible(true);
    }
    private void makeUi() {
        DrawCircles pan = new DrawCircles();
        add(pan);
    }
    private void makeMenu() {

    }
    public static void main(String[] args) {
        new Circles();
    }
}
