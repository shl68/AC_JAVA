import javax.swing.JPanel;
import java.awt.*;

public class MyDrawing extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        Font font = new Font("굴림체", Font.BOLD | Font.ITALIC, 48);
        g2.setColor(Color.RED);
        g2.drawRect(100, 100,100, 50);
                g2.setStroke(new BasicStroke(2.0f));

        g2.setColor(Color.BLUE);
        g2.drawOval(100, 100,100, 50);
        g2.setColor(Color.GREEN);
        g2.fillArc(100, 100,100, 50, 90, 90);
        g2.setFont(font);
        g2.drawString("Good Morning", 150, 50);
        
        
    }
}
