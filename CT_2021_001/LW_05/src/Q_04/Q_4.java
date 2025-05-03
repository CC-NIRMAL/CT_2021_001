package Q_04;

import java.util.Scanner;

public class Q_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int i = 1;
        while (i <= rows) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }


}
