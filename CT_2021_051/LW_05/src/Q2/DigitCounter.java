package Q2;
import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to quit): ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Program terminated.");
                break;
            }

            int digitCount = countDigits(number);
            System.out.println(number + " has " + digitCount + " digits.");
        }

    }

    // Method to count digits using a for loop
    public static int countDigits(int num) {

        // Count digits using for loop
        int count;
        for (count = 0; num > 0; count++) {
            num /= 10;
        }

        return count;
    }


}
