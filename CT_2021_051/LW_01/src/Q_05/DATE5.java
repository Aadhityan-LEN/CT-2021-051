/* Repeat Exercise 4, but this time use this format: Wednesday, May 10,
2023 */

package Q_05;
import java.text.SimpleDateFormat;
import java.util.*;


public class DATE5 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("EEEE, MMM dd,yyyy");
        System.out.println(sdf.format(today));
    }
}
