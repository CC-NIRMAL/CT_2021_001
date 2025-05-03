package Q_06;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;

        while (guess != secret) {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("Higher!");
            } else if (guess > secret) {
                System.out.println("Lower!");
            } else {
                System.out.println("Correct! You guessed it!");
            }
        }
    }

}
