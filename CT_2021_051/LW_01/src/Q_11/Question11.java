/*Write a program that asks the user for her or his full name in the format
first middle last and replies with the name in the format last, first
middle-initial. where the last name is followed by a comma and the
middle initial is followed by a period. For example, if the input is
Anthony Edward Stark then the output is Stark, Anthony E. */

package Q_11;

import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full name (first middle last) with spaces :");
        String text = scanner.nextLine();
        System.out.println(text);

        String[] parts = text.split(" ");
        String fname = parts[0];
        String mname = parts[1];
        String lname = parts[2];

        System.out.println(lname+","+" "+fname+" "+mname.charAt(0)+".");

    }
}
