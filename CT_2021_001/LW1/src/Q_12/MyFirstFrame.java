package Q_12;

import javax.swing.JFrame;

public class MyFirstFrame {
    public static void main(String[] args) {
        // create a new frame with the given title
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(300, 200);
        // set the position  50 pixels from the top, 100 pixels from the left
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
