package Q_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JButton button;
    boolean isOn = false;

    public MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);
        setLayout(new FlowLayout());

        button = new JButton("OFF");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (isOn) {
            getContentPane().setBackground(Color.GREEN);
            button.setText("OFF");
        } else {
            getContentPane().setBackground(Color.RED);
            button.setText("ON");
        }
        isOn = !isOn;
    }
}

public class Q5 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
