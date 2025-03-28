package Q_03;


public class Circle {
    private double radius;

    // No-Arg Constructor
    public Circle() {
        this.radius = 0.0;
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute the circumference of the circle
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter method to return radius
    public double getRadius() {
        return radius;
    }
}