package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter myform = DateTimeFormatter.ofPattern("d MMM yyyy");
        System.out.println("Today's Date: " + today.format(myform));
    }
}