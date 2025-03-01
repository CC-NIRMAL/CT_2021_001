package Q_08;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence with an exclamation mark (!): ");
        String input = scanner.nextLine();

        int index = input.indexOf('!');

        //In here display error message
        if (index == -1) {
            System.out.println("Error: There is no any  exclamation mark found.");
        } else {
            String firstPart = input.substring(0, index);
            String secondPart = input.substring(index + 1);

            System.out.println("First part: " + firstPart);
            System.out.println("Second part: " + secondPart);
        }

        scanner.close();
    }
}

