package Q_10;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter loan amount: ");   //lone amount
            double loanAmount = scanner.nextDouble();

            System.out.print("Enter annual interest rate (in %): ");
            double annualInterestRate = scanner.nextDouble();   //annual interest rate


            System.out.print("Enter loan period (in years): ");
            int loanPeriod = scanner.nextInt();   //lone period


            final int MONTHS_IN_YEAR = 12;
            double monthlyInterestRate = annualInterestRate / 100 / MONTHS_IN_YEAR; //monthlyInterestRate

            int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;    //ex 4years *12months

            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                    (1 - Math.pow(1/(1 + monthlyInterestRate),numberOfPayments));


            double totalPayment = monthlyPayment * numberOfPayments;

            System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
            System.out.printf("Total Payment: %.2f\n", totalPayment);

            scanner.close();

    }
}
