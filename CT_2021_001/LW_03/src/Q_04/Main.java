package Q_04;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Using the original Bicycle class
        Bicycle oldBike = new Bicycle("Chalaka Chandika");
        System.out.println("Bicycle Owner: " + oldBike.getOwner());

        System.out.println();

        // Using the new BicycleNew class with Owner object
        Owner owner = new Owner("Chalaka Chandika ", "077 6956956");
        BicycleNew newBike = new BicycleNew(owner);

        // Displaying details in the Main class
        System.out.println("Bicycle belongs to:");
        System.out.println("Owner Name: " + newBike.getOwner().getOwnerName());
        System.out.println("Phone No: " + newBike.getOwner().getPhoneNo());
    }
}
