package Q_05;
import java.util.Scanner;
public class Q_5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double total = 0.0;

            // here are the Entree Selection
            System.out.println("Select an Entree:");
            System.out.println("1. Tofu Burger - $3.49");
            System.out.println("2. Cajun Chicken - $4.59");
            System.out.println("3. Buffalo Wings - $3.99");
            System.out.println("4. Rainbow Fillet - $2.99");
            System.out.print("Enter your choice (1-4): ");
            int entreeChoice = input.nextInt();

            switch (entreeChoice) {
                case 1:
                    System.out.println("You selected: Tofu Burger");
                    total += 3.49;
                    break;
                case 2:
                    System.out.println("You selected: Cajun Chicken");
                    total += 4.59;
                    break;
                case 3:
                    System.out.println("You selected: Buffalo Wings");
                    total += 3.99;
                    break;
                case 4:
                    System.out.println("You selected: Rainbow Fillet");
                    total += 2.99;
                    break;
                default:
                    System.out.println("Invalid choice. No entree selected.");
            }

            // here  are the Side Dish Selection
            System.out.println("\nSelect a Side Dish:");
            System.out.println("1. Rice Cracker - $0.79");
            System.out.println("2. No-Salt Fries - $0.69");
            System.out.println("3. Zucchini - $1.09");
            System.out.println("4. Brown Rice - $0.59");
            System.out.print("Enter your choice (1-4): ");
            int sideChoice = input.nextInt();

            switch (sideChoice) {
                case 1:
                    System.out.println("You selected: Rice Cracker");
                    total += 0.79;
                    break;
                case 2:
                    System.out.println("You selected: No-Salt Fries");
                    total += 0.69;
                    break;
                case 3:
                    System.out.println("You selected: Zucchini");
                    total += 1.09;
                    break;
                case 4:
                    System.out.println("You selected: Brown Rice");
                    total += 0.59;
                    break;
                default:
                    System.out.println("Invalid choice. No side dish selected.");
            }

            // here are Drink Selection
            System.out.println("\nSelect a Drink:");
            System.out.println("1. Cafe Mocha - $1.99");
            System.out.println("2. Cafe Latte - $1.90");
            System.out.println("3. Espresso - $2.49");
            System.out.println("4. Oolong Tea - $0.99");
            System.out.print("Enter your choice (1-4): ");
            int drinkChoice = input.nextInt();

            switch (drinkChoice) {
                case 1:
                    System.out.println("You selected: Cafe Mocha");
                    total += 1.99;
                    break;
                case 2:
                    System.out.println("You selected: Cafe Latte");
                    total += 1.90;
                    break;
                case 3:
                    System.out.println("You selected: Espresso");
                    total += 2.49;
                    break;
                case 4:
                    System.out.println("You selected: Oolong Tea");
                    total += 0.99;
                    break;
                default:
                    System.out.println("Invalid choice. No drink selected.");
            }

            // here  Display Total
            System.out.printf("\nTotal amount: $%.2f\n", total);
        }
    }


