package Q_02;

import java.util.Scanner;

public class Temperature {
    private double celsius;

    // No-Arg Constructor
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter to return temperature in Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Getter to return temperature in Celsius
    public double toCelsius() {
        return celsius;
    }

    // Setter to assign temperature using Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter to assign temperature using Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature in Fahrenheit from user
        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        // Create Temperature object
        Temperature temp = new Temperature();

        // Set Fahrenheit value and convert to Celsius
        temp.setFahrenheit(inputFahrenheit);

        // Display equivalent Celsius temperature
        System.out.println("Equivalent temperature in Celsius: " + temp.toCelsius());

        scanner.close();
    }
}
