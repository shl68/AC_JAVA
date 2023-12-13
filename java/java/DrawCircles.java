import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;
public class DrawCircles extends JPanel implements MouseListener {
    int x, y;
    public DrawCircles() {
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {

        g.drawOval(x-5, y-5, 10, 10);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(String.format("%d - %d", e.getX(), e.getY()));
        x = e.getX();
        y = e.getY();
        repaint();
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
}
