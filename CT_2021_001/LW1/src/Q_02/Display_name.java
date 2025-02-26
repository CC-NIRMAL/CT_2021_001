package Q_02;

import javax.swing.JFrame;
import java.util.Scanner;

public class Display_name {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = name.nextLine();

        System.out.print("Enter last name: ");
        String lastName = name.nextLine();

        String fullName = firstName + " " + lastName;

        JFrame frame = new JFrame(fullName);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        name.close();
    }
}
