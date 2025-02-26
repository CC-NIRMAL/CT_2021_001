package Q_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWithDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter myform = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        System.out.println("Today's Date: " + today.format(myform));
    }
}
