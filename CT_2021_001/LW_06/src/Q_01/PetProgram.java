package Q_01;



import java.util.*;

public class PetProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nPet Menu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("5. Show All Pets");
            System.out.println("6. Show Cats Then Dogs");
            System.out.println("7. Show Dog Weight Stats");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter cat name: ");
                    String catName = input.nextLine();
                    System.out.print("Enter coat color: ");
                    String coatColor = input.nextLine();
                    Cat cat = new Cat();
                    cat.setName(catName);
                    cat.setCoatColor(coatColor);
                    pets.add(cat);
                    System.out.println("Cat added.");
                    break;

                case 2:
                    System.out.print("Enter dog name: ");
                    String dogName = input.nextLine();
                    System.out.print("Enter weight: ");
                    double weight = Double.parseDouble(input.nextLine());
                    Dog dog = new Dog();
                    dog.setName(dogName);
                    dog.setWeight(weight);
                    pets.add(dog);
                    System.out.println("Dog added.");
                    break;

                case 3:
                    System.out.print("Enter name of cat to remove: ");
                    String removeCatName = input.nextLine();
                    pets.removeIf(p -> p instanceof Cat && p.getName().equalsIgnoreCase(removeCatName));
                    System.out.println("Cat removed if found.");
                    break;

                case 4:
                    System.out.print("Enter name of dog to remove: ");
                    String removeDogName = input.nextLine();
                    pets.removeIf(p -> p instanceof Dog && p.getName().equalsIgnoreCase(removeDogName));
                    System.out.println("Dog removed if found.");
                    break;

                case 5:
                    System.out.println("\nAll Pets:");
                    for (Pet p : pets) {
                        System.out.print(p.getName() + " is a ");
                        if (p instanceof Cat) {
                            System.out.println("Cat, Coat Color: " + ((Cat) p).getCoatColor());
                        } else if (p instanceof Dog) {
                            System.out.println("Dog, Weight: " + ((Dog) p).getWeight());
                        }
                        System.out.println("Says: " + p.speak());
                    }
                    break;

                case 6:
                    System.out.println("\nCats:");
                    for (Pet p : pets) {
                        if (p instanceof Cat) {
                            System.out.println(p.getName() + " - Coat Color: " + ((Cat) p).getCoatColor());
                        }
                    }
                    System.out.println("\nDogs:");
                    for (Pet p : pets) {
                        if (p instanceof Dog) {
                            System.out.println(p.getName() + " - Weight: " + ((Dog) p).getWeight());
                        }
                    }
                    break;

                case 7:
                    double total = 0;
                    double min = Double.MAX_VALUE;
                    double max = Double.MIN_VALUE;
                    int count = 0;

                    for (Pet p : pets) {
                        if (p instanceof Dog) {
                            double w = ((Dog) p).getWeight();
                            total += w;
                            if (w < min) min = w;
                            if (w > max) max = w;
                            count++;
                        }
                    }

                    if (count > 0) {
                        System.out.println("\nDog Weight Statistics:");
                        System.out.println("Average: " + (total / count));
                        System.out.println("Minimum: " + min);
                        System.out.println("Maximum: " + max);
                    } else {
                        System.out.println("No dogs found.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);
    }
}
