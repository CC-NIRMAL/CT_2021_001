package Q_06;

import javax.swing.JFrame;
import java.util.Scanner;

public class newFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of frame (W): ");
        int width = scanner.nextInt();

        System.out.print("Enter height of frame (H): ");
        int height = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter frame of title: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// application terminates after closing thw window
        frame.setVisible(true);

        scanner.close();
    }
}
