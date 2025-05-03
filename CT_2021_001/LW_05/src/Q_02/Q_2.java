package Q_02;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if (number >= 0) {
                System.out.println("Digits: " + countDigits(Math.abs(number)));
            }
        } while (number >= 0);
    }

    public static int countDigits(int num) {
        if (num < 10) return 1;
        return 1 + countDigits(num / 10); // Recursive method
    }
}
