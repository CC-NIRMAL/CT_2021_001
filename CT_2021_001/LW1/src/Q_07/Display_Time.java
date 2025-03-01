package Q_07;

import javax.swing.JFrame;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Display_Time {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String timeString = currentTime.format(formatter);

        JFrame frame = new JFrame(timeString);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// application terminates after closing thw window
        frame.setVisible(true);
    }
}
