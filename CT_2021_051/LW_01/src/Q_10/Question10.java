/* Write a program that accepts an odd-length word and prints out the
middle character. For example, if the input is magnificent, which has 11
characters, you output the sixth character f. */

package Q_10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the odd length String : ");
        String text = scanner.nextLine();

        int length = text.length();
        char middle_letter;
        middle_letter =  text.charAt((length / 2));
        System.out.println(middle_letter);


    }
}
