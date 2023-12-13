import javax.swing.JFrame;

public class FirstGUI {
    public FirstGUI() {
        JFrame frame = new JFrame();
        frame.setSize(400, 350);
        frame.setTitle("첫번째 윈도");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new FirstGUI();
    }
}
