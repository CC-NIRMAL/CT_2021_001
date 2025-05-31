package Q_01;


import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter third number:"));
        int sum = num1 + num2 + num3;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
    }
}
