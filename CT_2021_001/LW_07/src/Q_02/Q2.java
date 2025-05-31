package Q_02;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
