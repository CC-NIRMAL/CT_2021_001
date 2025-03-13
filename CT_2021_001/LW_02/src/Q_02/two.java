package Q_02;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        System.out.println("Enter CM value :");
        Scanner scanner=new Scanner(System.in);
        int cm=scanner.nextInt();
        Double in=cm/2.54;

        System.out.printf("Inches : "+"%.2f%n",in);

        scanner.close();




    }


}
