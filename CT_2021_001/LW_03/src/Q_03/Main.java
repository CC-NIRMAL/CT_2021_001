package Q_03;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get input for outer circle radius
            System.out.print("Enter the radius of the outer circle (ro): ");
            double ro = scanner.nextDouble();

            // Get input for inner circle radius
            System.out.print("Enter the radius of the inner circle (ri): ");
            double ri = scanner.nextDouble();

            // Ensure ro is greater than ri
            if (ro <= ri) {
                System.out.println("Error: Outer radius must be greater than inner radius.");
            } else {
                // Create Circle objects for outer and inner circles
                Circle outerCircle = new Circle(ro);
                Circle innerCircle = new Circle(ri);

                // Compute the area of the circular region
                double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

                // Display the result
                System.out.println("The area of the circular region is: " + shadedArea);
            }

            scanner.close();
        }
}
