package Q_03;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JButton button;

    public MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("Click Me");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "You clicked!");
    }
}

public class Q3 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
