package Q_09;

import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        char first_C = input.charAt(0);
        char last_C = input.charAt(length - 1);

        System.out.println(length);
        System.out.println(first_C);
        System.out.println(last_C);

        scanner.close();
    }
}
