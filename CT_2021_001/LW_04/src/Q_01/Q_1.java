package Q_01;


import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int smallest;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}

