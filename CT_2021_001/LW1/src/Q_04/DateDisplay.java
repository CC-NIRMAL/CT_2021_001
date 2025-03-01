package Q_04;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDisplay {
    public static void main(String[] args) {
        Date today = new Date(); // Get current date

        // Define the date format
        SimpleDateFormat formatter = new SimpleDateFormat("d MMM yyyy");
        // Format the date
        String formattedDate = formatter.format(today);
        System.out.println("Today's Date: " + formattedDate);
    }
}
