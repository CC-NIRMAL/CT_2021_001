package Q_06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class six {
    public static void main(String[] args) {
           GregorianCalendar  year=new GregorianCalendar();
         //  System.out.println(today.get(Calendar.YEAR));




            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your birth year: ");
            int yearOfBirth = scanner.nextInt();
            int currentYear = year.get(Calendar.YEAR);
            int age = currentYear - yearOfBirth;
            System.out.println("You were born in " + yearOfBirth + " and will be (are) " + age + " this year.");
            scanner.close();
        }
    }



