package Q_11;

import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");

        if (nameParts.length != 3) {
            System.out.println("Error: Please enter your name in the correct format (First Middle Last).");
        } else {
            String firstName = nameParts[0];
            String middleInitial = nameParts[1].charAt(0) + ".";
            String lastName = nameParts[2];

            System.out.println(lastName + ", " + firstName + " " + middleInitial);
        }

        scanner.close();
    }
}
