package Q_04;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {

        System.out.print("Enter Weight in Kg : ");
        Scanner scanner=new Scanner(System.in);

        double body_W= scanner.nextDouble();


        double calories=body_W*19;
        System.out.print(" Number of calories the person needs in one day : "+calories);
        scanner.close();







    }


}
