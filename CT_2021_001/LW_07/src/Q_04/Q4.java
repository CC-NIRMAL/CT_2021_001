package Q_04;


import javax.swing.*;
        import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    public MyFrame() {
        setSize(300, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(50, 20, 200, 25);
        add(textField);

        button = new JButton("Set Title");
        button.setBounds(90, 60, 120, 30);
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        setTitle(textField.getText());
    }
}

public class Q4 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
