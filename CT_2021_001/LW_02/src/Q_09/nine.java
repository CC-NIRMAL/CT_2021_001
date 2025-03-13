package Q_09;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double P = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double R = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int N = scanner.nextInt();

        double finalAmount = P * Math.pow((1 + (R / 100)), N);
        System.out.printf("Total amount after %d years: %.2f\n", N, finalAmount);
        scanner.close();

    }
}
