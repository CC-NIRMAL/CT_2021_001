package Q_10;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();
        //check
        if (word.length() % 2 == 0) {
            System.out.println("Error: The word must have an odd number of characters.");
        } else {
            int middleIndex = word.length() / 2;
            System.out.println("Middle character: " + word.charAt(middleIndex));
        }

        scanner.close();
    }
}
