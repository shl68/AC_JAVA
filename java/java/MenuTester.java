import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class MenuTester extends JFrame {
    public MenuTester() {
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        makeMenu();
        makeUi();
        setVisible(true);
    }
    public void makeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenuItem openMn = new JMenuItem("Open");
        JMenuItem exitMn = new JMenuItem("Exit");

        exitMn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);    
            }

        });
        openMn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);                
                System.out.println(chooser.getSelectedFile());
            }
            
        });

        file.add(openMn);
        file.add(exitMn);

        menuBar.add(file);
        menuBar.add(edit);
        setJMenuBar(menuBar);
    }
    public void makeUi() {
        MyDrawing panel = new MyDrawing();
        JToolBar bar = new JToolBar();
        bar.add(new JLabel("툴바 연습용"));

        setLayout(new BorderLayout());

        add(panel, BorderLayout.CENTER);
        add(bar, BorderLayout.NORTH);
    }
    public static void main(String[] args) {
        new MenuTester();
    }
}