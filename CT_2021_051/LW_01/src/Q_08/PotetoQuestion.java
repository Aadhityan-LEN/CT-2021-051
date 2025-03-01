/*
Using the Scanner, input a string that contains a single exclamation mark.
Divide the input string into two strings, one before and the other after the
exclamation mark, and output them. Do not include the exclamation mark
in the output.
For example, if the input string is one potato two potato ! three potato,
then the output would be,
one potato two potato
three potato
*/
package Q_08;
import java.util.*;

public class PotetoQuestion {
    public static void main(String[] args) {
        String word ,a,b ;
        //new array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word :");
        word = scanner.nextLine();

        String[] sentence = word.split("!",2);

        if (sentence.length == 2){
            System.out.println(sentence[0].trim());
            System.out.println(sentence[1].trim());
        }

    }
}
