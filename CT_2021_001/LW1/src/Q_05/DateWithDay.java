package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;


public class  DateWithDay {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM d, yyyy");
        String formattedDate = formatter.format(today);
        System.out.println("Today's Date: " + formattedDate);
    }
}
