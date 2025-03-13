package Q_03;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius  : ");
        double Celsius=scanner.nextDouble();
        double Fahrenheit=(1.8*Celsius)+32;
        System.out.println("Temperature in Fahrenheit : "+Fahrenheit);


        scanner.close();
}

}
