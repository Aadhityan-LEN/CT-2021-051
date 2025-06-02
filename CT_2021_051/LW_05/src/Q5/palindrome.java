package Q5;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word or phrase :");
        String word= scanner.nextLine();
        int length = word.length();

        String reverse ="";

        for (int i = length-1 ; i>=0; i--){
            reverse+= word.charAt(i);
        }
        if (word.equals(reverse))
            System.out.println("given word is palindrome");
        else
            System.out.println("given not word is palindrome");
    }

}
