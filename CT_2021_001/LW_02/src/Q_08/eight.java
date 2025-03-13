package Q_08;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the radius of the sphere (m): ");
                double r = scanner.nextDouble();      //r=radius

                double volume = (4.0 / 3.0) * (Math.PI * Math.pow(r, 3));
                System.out.printf("The volume of the sphere is: %.2f ", volume);//cubic units
                scanner.close();
            }
        }



