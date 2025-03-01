/* Write a program to display today’s date in this format: 17 May 2023. Use
the console window for output */


package Q_04;
import java.text.SimpleDateFormat;
import java.util.*;

public class DATE {
    public static void main(String[] args) {

        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(today));
    }
}
