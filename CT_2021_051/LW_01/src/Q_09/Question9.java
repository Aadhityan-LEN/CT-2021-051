/*  Write a program that accepts a string input and outputs the number of
characters in the string and the first and last characters in separate lines.
For example, if the input is I like Java then the output would be,
11
I
a               */
package Q_09;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text : ");
        String text = scanner.nextLine();
        int length = text.length();

        System.out.println(length);
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(length-1));

    }
}
