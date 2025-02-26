package Q_03;

import java.util.Scanner;

public class F_Name {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = name.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = name.nextLine();

        System.out.print("Enter last name: ");
        String lastName = name.nextLine();

        String full_name = firstName + " " + middleName.charAt(0) + ". " + lastName;
        System.out.println("Full Name: " + full_name);

        name.close();
    }
}