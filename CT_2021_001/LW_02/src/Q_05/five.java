package Q_05;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.printf("Temperature in Celsius : " + "%.2f%n",celsius);
        scanner.close();







    }
}
